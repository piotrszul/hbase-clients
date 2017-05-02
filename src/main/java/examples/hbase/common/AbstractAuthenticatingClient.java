package examples.hbase.common;

import java.security.PrivilegedAction;

import javax.security.auth.Subject;
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
		// but the LoginContext can be also created with a specific configuration or a speficied jaas config file.
		// For examples check:
		// * https://github.com/apache/kafka/blob/e31c0c9bdbad432bc21b583bd3c084f05323f642/clients/src/main/java/org/apache/kafka/common/security/JaasContext.java
		// * https://github.com/apache/hbase/blob/master/hbase-examples/src/main/java/org/apache/hadoop/hbase/thrift/DemoClient.java
		
		
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
