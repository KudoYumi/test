package forEach;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<String> numlist = new ArrayList<>();

		numlist.add("100");
		numlist.add("101");
		numlist.add("102");
		numlist.add("103");

		numlist.stream().forEach(System.out::print);
	}
}
