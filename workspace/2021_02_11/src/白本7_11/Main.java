package 白本7_11;

public class Main implements Inter{
	public static void main(String[] args) {
		Sub sub = new Sub();
		Main main = sub;
		Inter inter = main;
		System.out.println(inter);

		Inter inter2 = new Main();
		System.out.println(inter2);
	}

	@Override
	public String toString() {
		return "I am Main";
	}

}
