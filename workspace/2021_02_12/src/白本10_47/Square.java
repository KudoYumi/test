package 白本10_47;

public class Square {
	int square = 81;

	public static void main(String[] args) {
		new Square().go();
	}

	void go() {
		incr(square++);
		System.out.println(square); //91
	}

	void incr(int square) {
		System.out.println(square); //81
		System.out.println(this.square); //82
		this.square = square +10;
	}
}
