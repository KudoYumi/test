package 文字列操作;

public class Main02 {
	public static void main(String[] args) {
		String str = "Java and JavaScript";

		System.out.println(str.contains("Java"));
		System.out.println(str.endsWith("pt"));

		System.out.println(str.indexOf("and"));
		System.out.println(str.indexOf("Java"));

		System.out.println(str.lastIndexOf("Java"));
	}
}
