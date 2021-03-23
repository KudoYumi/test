package 紫本6_23;

public class Test {
	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new Y();

		((Y)x2).show();//hello
		((A)x1).show();
	}
}
