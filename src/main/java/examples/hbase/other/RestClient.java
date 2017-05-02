package examples.hbase.other;

import java.net.HttpURLConnection;
import java.net.URL;

import com.cloudera.alfredo.client.AuthenticatedURL;

public class RestClient {
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://hadoop1-01-cdc.it.csiro.au:8101/");
		AuthenticatedURL.Token token = new AuthenticatedURL.Token();
		HttpURLConnection conn = new AuthenticatedURL().openConnection(url, token);
		conn.connect();
		
	}
}
