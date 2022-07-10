import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
	
	private final static String address = "https://www.findip.kr/";
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect(address).get();
		String h1 = doc.select("h1").text();
		String h2 = doc.select("h2").eq(0).text();
		System.out.println(h1);
		System.out.println(h2);
		Elements contents = doc.select("p");
		for(Element element : contents) {
			System.out.println(element.text());
		}
	}

}
