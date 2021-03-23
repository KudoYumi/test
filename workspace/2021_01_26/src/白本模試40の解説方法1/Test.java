package 白本模試40の解説方法1;

public class Test {
	public static void main(String[] args) {
		Fruit f = new Orange();
	//	new Orange().foo(); →Orangeのメソッドアクセス

		f.foo();
		new Fruit().foo();
	}
}
