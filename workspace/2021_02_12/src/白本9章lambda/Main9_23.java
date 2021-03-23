package 白本9章lambda;

public class Main9_23 {
	public static void main(String[] args) {
		String val = "A";

		Function f = () -> System.out.println(val);

	}
}

interface Function{
	void test();
}
