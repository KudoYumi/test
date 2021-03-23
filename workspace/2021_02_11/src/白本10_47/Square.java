package 白本10_47;

public class Square {
	int square = 81;

	public static void main(String[] args) {
		new Square().go();
	}

	void go() {
		incr(square++);//引数として81を渡す
		System.out.println(square); //
	}

	void incr(int square) { //81
		this.square += 10; //92
	}
}
