package code15_07;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def:ghi";

		String[] words = s.split("[beh]");

		for(String w:words) {
			System.out.print(w +">>");
		}

	}

}
