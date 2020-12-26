package code15_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception{
		SimpleDateFormat f = new SimpleDateFormat("y/M/d H:m:s");

		Date d = f.parse("2020/11/26 10:59:45");
		System.out.println(d);

		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は"+s+"です");

	}

}
