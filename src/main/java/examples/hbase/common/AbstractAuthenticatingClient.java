package examples.hbase.common;

import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;
import javax.security.auth.login.LoginContext;


/**
 * Login a user with JAAS using HbaseClient config.
 * The following java properties need to be set (last two are optional)
 * 		System.setProperty("java.security.krb5.conf", "/Users/szu004/dev/hbase-clients/conf/krb5.conf");
 *		System.setProperty("java.security.auth.login.config", "/Users/szu004/dev/hbase-clients/conf/jaas.config");
 *		System.setProperty("sun.security.krb5.debug", "true");
 *		System.setProperty("javax.security.auth.useSubjectCredsOnly", "true");
 */

public abstract class AbstractAuthenticatingClient {
	
	public abstract void handleDoAsLogedUser() throws Exception;

	public void doAsLogedUser() throws Exception {
		
		// NOTE: This implementation uses default JAAS config passed in java property  
		// but the LoginContext can be also created with a specific configuration:
		// from: https://github.com/apache/hbase/blob/master/hbase-examples/src/main/java/org/apache/hadoop/hbase/thrift/DemoClient.java
//	      LoginContext context = new LoginContext("", new Subject(), null,
//        new Configuration() {
//          @Override
//          public AppConfigurationEntry[] getAppConfigurationEntry(String name) {
//            Map<String, String> options = new HashMap<String, String>();
//            options.put("useKeyTab", "false");
//            options.put("storeKey", "false");
//            options.put("doNotPrompt", "true");
//            options.put("useTicketCache", "true");
//            options.put("renewTGT", "true");
//            options.put("refreshKrb5Config", "true");
//            options.put("isInitiator", "true");
//            String ticketCache = System.getenv("KRB5CCNAME");
//            if (ticketCache != null) {
//              options.put("ticketCache", ticketCache);
//            }
//            options.put("debug", "true");
//
//            return new AppConfigurationEntry[]{
//                new AppConfigurationEntry("com.sun.security.auth.module.Krb5LoginModule",
//                    AppConfigurationEntry.LoginModuleControlFlag.REQUIRED,
//                    options)};
//          }
//});			
		
		// or a specific jaas config file.
		// For examples check:
		// * https://github.com/apache/hbase/blob/master/hbase-examples/src/main/java/org/apache/hadoop/hbase/thrift/DemoClient.java
	
		// ALSO: For long running processes the kerberos Subject (ticket) needs to be periodically refreshed:
		// For sample code see: https://github.com/apache/kafka/blob/d5fb7364aebf293c621b804a4585eb9ef1001864/clients/src/main/java/org/apache/kafka/common/security/kerberos/KerberosLogin.java
		
		LoginContext lc = new LoginContext("HbaseClient");
		// attempt authentication
		lc.login();
		// Now try to execute ClientAction as the authenticated Subject
		Subject mySubject = lc.getSubject();
		PrivilegedAction<Object> action = new PrivilegedAction<Object>() {

			@Override
			public Object run() {
				try {
					handleDoAsLogedUser();
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
				return null;
			}
		};
		Subject.doAs(mySubject, action);
	}
}
