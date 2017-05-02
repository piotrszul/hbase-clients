package examples.hbase.rest;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * @author szu004
 * Basic REST HttpClient with no authenication.
 * To list all the tables in hbase (and check connection use)
 * HttpClientPlanRestClient <hbase-rest-gateway-url>  
 * 
 * If the gateway is secured the reponse should be 401 (Authentication Required)
 */
public class HttpClientPlanRestClient {

	public static void main(String[] args) throws Exception {

		if (args.length < 1) {
			System.out.println("Usage: HttpClientPlanRestClient <url>");
			System.exit(1);
		}
		String url = args[0];
		CloseableHttpClient client = HttpClients.createDefault();
		HttpClientContext context = HttpClientContext.create();
		HttpGet httpget = new HttpGet(url);
		CloseableHttpResponse response = client.execute(httpget, context);

		String responseString = IOUtils.toString(response.getEntity().getContent());
		System.out.println("Response:");
		System.out.println(responseString);
		client.close();
	}

}
