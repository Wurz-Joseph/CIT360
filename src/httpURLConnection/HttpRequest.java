package httpURLConnection;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class HttpRequest {
	public static void main(String[] args) {
		try {
			String url = "https://jsonplaceholder.typicode.com/users";
			// create URL object passing the API url in.
			URL urlObj = new URL(url);
			// cast the URL object in an HTTPURLConnection
			HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();

			// set the request type. I use "GET" here.
			conn.setRequestMethod("GET");
			// open connection stream to API
			conn.connect();
			System.out.println("\nSending 'GET' request to URL : " + url);

			// Get the response code
			int responseCode = conn.getResponseCode();

			// exception handling
			if (responseCode != 200) {
				throw new RuntimeException("HttpResponseCode: " + responseCode);
			} else {
				// print statusCode
				System.out.println("Response code: " + responseCode);
				Scanner sc = new Scanner(urlObj.openStream());
				String inline = "";
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				System.out.println("\nJSON data: ");
				System.out.println(inline);
				sc.close();

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
