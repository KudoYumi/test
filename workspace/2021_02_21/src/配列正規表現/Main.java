package 配列正規表現;

public class Main {
	public static void main(String[] args) {
		String str = "abc123def456";

		String[] array = str.split("[a-z]");

		for(String s:array) {
			System.out.println(s);
		}
	}
}
