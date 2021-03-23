package 白本9_23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("AAA",500);
		Customer c2 = new Customer("BBB",300);

		List<Customer> list = new ArrayList<Customer>();
		list.add(c1);
		list.add(c2);

		Predicate<Customer> p = c ->
							c.getPoint() < 600 && c.getName().length()<4;
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
