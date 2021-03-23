package cast式;

public class Main {
	public static void main(String[] args) {
		Base b1 = new B(); //参照は200番
		Base b2 = new A(); //参照は201番
		Base b3 = new B(); //参照は202番
		b1 = b3; //b1の参照が202番に変わった
		Base b4 = (A)b3; //b4の参照先も202番

		b1.test();
		b4.test();
	}
}
