package 例外03;

public class Sample {
	public static void main(String[] args) {

		try {
			int result = Integer.parseInt("a");
			System.out.println(result*2);
		}catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("trouble");

		}catch(NumberFormatException e) {
			System.out.println("number exception");
		}

		System.out.println("hello");
	}
}
