package 黒本02;

public class Main1 {
	private static int num;

	static {
		num = 10;
	}

	static {
		num = 20;
	}

	static void test(int num) {
		Main1.num = num*num;
	}

	public static void main(String[] args) {
		test(num);
		System.out.println(num);
	}
	


}
