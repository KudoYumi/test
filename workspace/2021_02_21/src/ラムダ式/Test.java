package ラムダ式;

public class Test {
	static String gender;

	public static void main(String[] args) {
		Function f = val -> System.out.println("hello"+gender+val);

		f.test("斎藤");
		gender = "Ms";

		
	}
}
