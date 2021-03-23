package 白本模試35;

public class Bar {
	static void changeFoo(Foo f) {
		f = new Foo(512);
	}

	public static void main(String[] args) {
		Foo f = new Foo(100);
		changeFoo(f);
		System.out.println(f.getNum());
	}
}
