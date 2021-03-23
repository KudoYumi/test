package 白本10_47;

public class Squqre1 {
	int square = 81;

	public static void main(String[] args) {
		new Squqre1().go();
	}

	void go() {
		incr(square++);//引数として81を渡す
		System.out.println(square); //82
	}

	void incr(int square) {
		square += 10;
	}
}
