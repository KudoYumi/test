package 紫本6_23_解;

public class Main {
	public static void main(String[] args) {
	//	A x = (A)new X(); 例外発生
		X x2 = new Y();
		((Y)x2).show();

		X x1 = new X();

		((A)x1).show();//classcast例外
	}
}
