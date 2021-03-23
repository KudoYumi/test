package 継承関係;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();

		System.out.println(a.val);
	//	System.out.println(b.name); Aクラスにnameはない

		a.print();
		b.print();
	}
}
