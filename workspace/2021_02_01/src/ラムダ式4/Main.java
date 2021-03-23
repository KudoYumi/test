package ラムダ式4;

public class Main {
	public static void main(String[] args) {
		Function f = name -> "hello"+name;

		System.out.println(f.test("Lamda"));
	}

	private static interface Function{
		String test(String name);
	}
}
