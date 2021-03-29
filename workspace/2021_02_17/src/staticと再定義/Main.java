package staticと再定義;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();

		a.hoge(); //Ahoge
		b.hoge(); //Ahoge

		a.foo(); //Afoo
		b.foo(); //Bfoo
	}
}
