package 黒本7章;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();

		System.out.println(a.val);
		System.out.println(b.val);
		a.print(); //AのprintだからA
		b.print(); //オーバーライドされてるからBの方のprint()
	}
}
