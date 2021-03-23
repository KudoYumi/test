package 黒本9章;

public class Main2 {
	private static int num ;

	static{
		num = 10;
	}

	static {
		num = 20;
	}

	static void test(int num) {
		Main2.num = num * num;
	}

	public static void main(String[] args) {
		test(num);
		System.out.println(num);
	}
}
