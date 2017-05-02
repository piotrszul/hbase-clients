package examples.hbase.rest;

import java.security.Principal;

import org.apache.commons.io.IOUtils;
import org.apache.http.auth.AuthSchemeProvider;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import examples.hbase.common.AbstractAuthenticatingClient;


/**
 * 	This may seem odd, but specifying 'null' as principal tells java to
 *  use the logged in user's credentials
 */
class UseJaasCredentials implements Credentials {

	public String getPassword() {
		return null;
	}

	public Principal getUserPrincipal() {
		return null;
	}
};

public class HttpClientSecureRestClient extends AbstractAuthenticatingClient {

	private final String url;
	
	public HttpClientSecureRestClient(String url) {
		this.url = url;
	}
	
	@Override
	public  void handleDoAsLogedUser() throws Exception {
		Lookup<AuthSchemeProvider> authSchemeRegistry = RegistryBuilder.<AuthSchemeProvider> create()
				.register(AuthSchemes.SPNEGO, new SPNegoSchemeFactory(true)).build();

		CloseableHttpClient client = HttpClients.custom().setDefaultAuthSchemeRegistry(authSchemeRegistry).build();
		HttpClientContext context = HttpClientContext.create();
		BasicCredentialsProvider credentialsProvider = new BasicCredentialsProvider();

		credentialsProvider.setCredentials(new AuthScope(null, -1, null), new UseJaasCredentials());
		context.setCredentialsProvider(credentialsProvider);

		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse response = client.execute(httpget, context);
		String responseString = IOUtils.toString(response.getEntity().getContent());

		System.out.println("Response:");
		System.out.println(responseString);
	}

	public static void main(String[] args) throws Exception {

		if (args.length < 1) {
			System.out.println("Usage: HttpClientSecureRestClient <url>");
			System.exit(1);
		}
		new HttpClientSecureRestClient(args[0]).doAsLogedUser();
	}
}
