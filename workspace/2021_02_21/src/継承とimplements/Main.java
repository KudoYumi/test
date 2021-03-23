package 継承とimplements;

public class Main {
	public static void main(String[] args) {
		A a = (A)(new B());

		D d = new D();
		A x = (A)d;

	//	B b = (B) new D();	エラー
	}
}
