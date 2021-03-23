package 白本10_35;

public class Bar {
	public static void main(String[] args) {
		Foo f = new Foo(100);

		f = changeFoo(f);
		System.out.println(f.getNum()); //新しいインスタンスへの参照ゆえ512
	}

	static Foo changeFoo(Foo f) {
		f = new Foo(512);
		return f;
	}
}
