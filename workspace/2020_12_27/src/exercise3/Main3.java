package exercise3;

import java.time.LocalDate;

public class Main3 {

	public static void main(String[] args) {
		Product p1 = new Product("A1","Xen",357,LocalDate.of(2016,9,16),true);

	//	System.out.println(p1.toString());エラーではないが・・・
		System.out.println(p1);
		System.out.println(p1.totalPrice(5));
	}

}
