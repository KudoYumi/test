package code15_16;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {

	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y/M/d");

		LocalDate ldate = LocalDate.parse("2020/09/22",fmt);


		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は"+str);


		LocalDate now = LocalDate.now();
		if(now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
		}

	}

}
