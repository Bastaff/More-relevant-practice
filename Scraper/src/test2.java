import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class test2 {
	public static void main(String[] args) throws IOException {
		getEarnings();
	}

	public static void constructUrl(String path) throws IOException {
		String _clientKey = "cg085gp1blld8mn:c2pvgpmopdbyqtc";
		String base_url = "http://api.tradingeconomics.com";
		String auth;
		if (path.contains("?"))
			auth = base_url + path + "&c=" + _clientKey;
		else
			auth = base_url + path + "?c=" + _clientKey;

		URL obj = new URL(auth);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		String mimeType = con.getContentType( );   
        System.out.println(" The mime type is : "+mimeType);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		String rework = response.toString().replaceAll(",", "\n");
		// print result
		System.out.println(rework);
		// System.out.println(response.toString());
	}

	public static void getEarnings() throws IOException {

		// set the path for the query
		String path = "/country/new%20zealand";

		System.out.println("--------Default earnings calendar--------");
		constructUrl(path);
	}
}