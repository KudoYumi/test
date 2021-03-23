package split;

public class Main {
	public static void main(String[] args) {
		String word = "Panda, Pabbit,Tiger";

		String[] sw = word.split("\\,\\s");
		for(String s:sw) {
			System.out.println(s);
		}
		int a = 'b';
		System.out.println(a);
		char c = 100;
		System.out.println(c);
	}
}
