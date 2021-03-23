package 紫本5_10;

public class Main {
	public static void main(String[] args) {
		Boo b = new Boo("Boo");
		Goo g = new Goo("Goo");

	//	System.out.println("".equals(args[0]));

		Goo g2 = b.useGoo(g);
		System.out.println(g2);
	}
}
