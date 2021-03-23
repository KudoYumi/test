package 白本10_40;

public class Main {
	public static void main(String[] args) {
		Fruit f = new Orange();

		f.foo();//非検査が投げられてくる
	}
}
