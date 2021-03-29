package staticと再定義;

public class B extends A{
	static void hoge() {
		System.out.println("Bhoge");
	}

	@Override
	void foo() {
		System.out.println("Bfoo");
	}
}
