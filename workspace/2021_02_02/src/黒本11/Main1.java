package 黒本11;

public class Main1 {
	public static void main(String[] args) {
		String str = "a b 3 d e";

		String[] array = str.split("\\d");
		System.out.println(array[0]);
	}
}
