package 白本6_36;

public class Juice {
	public static void main(String[] args) {
		Orange orange = new Orange(200);
		System.out.println(orange.getX()+",");

		foo(orange);
		System.out.println(orange.getX()); //200
	}

	static void foo(Orange orange) {
		orange = new Orange(100);
		
	}
}
