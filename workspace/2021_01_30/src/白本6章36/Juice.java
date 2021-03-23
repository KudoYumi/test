package 白本6章36;

public class Juice {
	public static void main(String[] args) {
		Orange orange = new Orange(200);
		System.out.println(orange.getX()+"-");

		foo(orange);
		System.out.println(orange.getX());
	}

	static void foo(Orange ora) {
		ora = new Orange(100);
		System.out.println(ora.getX());
	}
}
