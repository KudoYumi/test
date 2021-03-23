package 引数が参照のとき;

public class Juice {
	public static void main(String[] args) {
		Orange orange = new Orange(200);
		System.out.println(orange.getX());

		orange = foo(orange);
		System.out.println(orange.getX());
	}

	static Orange foo(Orange ora) {
		ora = new Orange(100);
		return ora;
	}
}
