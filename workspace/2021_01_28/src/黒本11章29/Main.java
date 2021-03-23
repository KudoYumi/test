package 黒本11章29;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015,1,31);
		date = date.plusDays(10);
		System.out.println(date);
	}

}
