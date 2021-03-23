package 黒本8章01;

public class Main {
	public static void main(String[] args) {
		System.out.println(test(null));
	}

	public static String test(Object obj) {
		try {
			System.out.println(obj.toString());
		}catch(NullPointerException e) {
			System.out.println("catch");
			return "A";
		}finally {
			System.out.println("finally");
			return "B";
		}
	}
}
