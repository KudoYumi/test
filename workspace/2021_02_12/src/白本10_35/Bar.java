package 白本10_35;

public class Bar {
	public static void main(String[] args) {
		Foo f = new Foo(100);
		changeFoo(f);
		System.out.println("f is "+f.getNum()); //100
	}

	static void changeFoo(Foo f) {
		f = new Foo(512);
	}
}
