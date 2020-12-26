package code15_11;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();

		System.out.println(now);
		System.out.println(now.getTime()); //引数なしだと今現在の時刻

		Date past = new Date(1600705425827L); //
		System.out.println(past);
	}

}
