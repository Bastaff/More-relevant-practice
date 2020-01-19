import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ScraperRun {

	public static void main(String[] args) throws Exception {

		URL oracle = new URL("https://api.tradingeconomics.com/calendar/country/united%20states?c=guest:guest");
		URLConnection yc = oracle.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
		
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
		
		System.out.println(inputLine);
	}
}
