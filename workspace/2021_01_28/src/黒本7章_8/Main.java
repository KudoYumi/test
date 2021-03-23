package 黒本7章_8;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();

		System.out.println(a.val); //A出力
		System.out.println(b.val); //A

		a.print();
		b.print();
	}
}
