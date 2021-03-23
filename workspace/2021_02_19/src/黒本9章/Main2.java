package 黒本9章;

import java.time.LocalDate;

public class Main2 {
	public static void main(String[] args) {
		LocalDate a = LocalDate.of(2015,1,2);
		LocalDate b = LocalDate.parse("2015-01-02");
		System.out.println(a.equals(b));
	}
}
