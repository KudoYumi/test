package 黒本11章13;

public class Main {
	int num;
	private static void test() {
		Main m = new Main();
		m.num++;
		System.out.println(m.num);
	}

	public static void main(String[] args) {
		Main.test();
		Main.test();
	//→ではnumがstaticなら？
	}
}
