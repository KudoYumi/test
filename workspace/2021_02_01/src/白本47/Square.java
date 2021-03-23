package 白本47;

public class Square {
	int num = 81;

	public static void main(String[] args) {
		new Square().go();
	}

	void go() {
		incr(num++);
		System.out.println(num);
	}

	void incr(int num) {
		this.num = num+10;
	}
}
