package code15_12;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		c.set(2020,11,26,12,15,45);
		c.set(Calendar.MONTH,1);

		Date d = c.getTime();
		System.out.println(d);

		//Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);

		int y2 = c.get(Calendar.YEAR);
		int m2 = c.get(Calendar.MONTH);

		System.out.println("今年は"+y2+"年"+(m2+1)+"月です");
	}

}
