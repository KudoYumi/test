package code15_17;
import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2020,11,26);
		LocalDate d2 = LocalDate.of(2020,12,28);
		LocalDate d = LocalDate.of(2012,11,05);

		Period p1 = Period.ofDays(30);
		Period p2 = Period.between(d1, d2);
		Period p = Period.between(d1,d);

		System.out.println(p2);
		System.out.println(p);  //過去のものだとマイナスで出てくる

		LocalDate d3 = d2.plus(p2);
		System.out.println(d3);
	}

}
