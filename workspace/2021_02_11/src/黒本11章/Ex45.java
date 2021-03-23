package 黒本11章;

public class Ex45 {
	public static void main(String[] args) {
		String str = "a b 3 d e";
		String[] array = str.split("\\d");

		System.out.println(array[1]);
		System.out.println(array[0]);
		System.out.println(array.length);
	}
}
