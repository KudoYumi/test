package 黒本11章13;

public class Main2 {
	static int num;

	private static void test() {
		num++;
		System.out.println(num);
	}

	public static void main(String[] args) {
		Main2.test(); //numは1に
		Main2.test(); //1→2
	}
}
