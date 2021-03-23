package 黒本8章_14;

public class Main {
	public static void main(String[] args) {
		A a = new A(10);
		B b = new B(10);

		System.out.println(a.equals(b));
		System.out.println(b.equals(a));
	}
}
