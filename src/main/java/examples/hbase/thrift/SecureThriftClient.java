package examples.hbase.thrift;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import javax.security.sasl.Sasl;

import org.apache.hadoop.hbase.thrift.generated.Hbase;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSaslClientTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import examples.hbase.common.AbstractAuthenticatingClient;

public class SecureThriftClient extends AbstractAuthenticatingClient {

	private final String principal;
	
	
	public SecureThriftClient(String principal) {
		this.principal = principal;
	}

	@Override
	public void handleDoAsLogedUser() throws Exception {
		String thiftHost = principal.split("/")[1];
		String thiftUser = principal.split("/")[0];
		
		System.out.println("Host: " + thiftHost + ", user: " + thiftUser);
		
		TTransport baseTransport = new TSocket(thiftHost, 9090);	    
	    Map<String, String> saslProperties = new HashMap<String,String>();
	    saslProperties.put(Sasl.QOP, "auth");  // authorization and confidentiality
	    
	    TTransport saslTransport = new TSaslClientTransport(
	            "GSSAPI",       //  tell SASL to use GSSAPI, which supports Kerberos
	            null,           //  authorizationid - null
	            thiftUser,   //  base kerberos principal name - myprincipal/my.client.com@MY.REALM 
	            thiftHost,    //  kerberos principal server - myprincipal/my.server.com@MY.REALM
	            saslProperties,      //  Properties set, above
	            null,           //  callback handler - null
	            baseTransport);     //  underlying transport
	    
	    saslTransport.open();
	    System.out.println("Opened connection");
	    TProtocol protocol = new TBinaryProtocol(saslTransport, true, true);
	    Hbase.Client client = new Hbase.Client(protocol);
	    for (ByteBuffer name:client.getTableNames()) {
	    	System.out.println(new String(name.array()));
	    }   
	    saslTransport.close();
	}
	
	public static void main(String[] args) throws Exception {

		if (args.length < 1) {
			System.out.println("Usage: SecureThriftClient <thrift-principal-no-realm>");
			System.out.println("\te.g.: SecureThriftClient thrift/hadoop.it.csiro.au");
			System.exit(1);
		}
		new SecureThriftClient(args[0]).doAsLogedUser();
	}

}
