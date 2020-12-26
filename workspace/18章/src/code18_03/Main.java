package code18_03;
import java.io.InputStream;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws Exception{
		URL u = new URL("https://www.google.com/?hl=ja");
		InputStream is = u.openStream();

		int i = is.read();

		while(i != -1) {
			char c = (char)i;
			System.out.print(c);
			i = is.read();
		}

	}

}
