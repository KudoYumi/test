package 白本10_47;

public class Square2 {
	int square = 81;

	public static void main(String[] args) {
		new Square2().go();
	}

	void go() {
		incr(square++);//引数として81を渡す そのあと82
		System.out.println(square); // 91
	}

	void incr(int square) {
		this.square = square+10; //91セット
		System.out.println(square);
	}

}
