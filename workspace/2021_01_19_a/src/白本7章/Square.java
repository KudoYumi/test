package 白本7章;

public class Square extends Shape{

	public Square() {
		super();
	}

	public Square(String label) {
	//	super(label);
		System.out.println("Square:コンストラクター");
	}

	public void area() {
		super.area();
	}

	public void area(String label) {
		System.out.println("Square:area");
	}
}
