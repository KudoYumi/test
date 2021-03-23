package 白本7章_26;

public class Parent {
	protected void hoge() {
		System.out.println("スーパークラス");
	}
}

class Child extends Parent{
	@Override
	public void hoge() {
		System.out.println("サブクラス");
	}
}
