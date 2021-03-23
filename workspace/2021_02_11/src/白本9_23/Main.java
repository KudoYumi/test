package 白本9_23;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Customer c1 = new Customer("AAA",500);
		Customer c2 = new Customer("BBB",300);
		Customer c3 = new Customer("CCC",250);
		Customer c4 = new Customer("DDD",420);
		Customer c5 = new Customer("EEE",370);

		List<Customer> list = Arrays.asList(c1,c2,c3,c4,c5);

		Predicate<Customer> p =
					(Customer c) -> { return c.getPoint()<500 && c.getPoint()>=250;};

		func(list,p);
	}

	public static void func(List<Customer> list, Predicate<Customer> p) {
		for(Customer c:list) {
			if(p.test(c)) {

				System.out.println(c.getName());
			}
		}
	}
}
