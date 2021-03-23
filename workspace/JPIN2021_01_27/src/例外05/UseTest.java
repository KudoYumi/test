package 例外05;

public class UseTest {
	public static void main(String[] args) {

		Test t = new Test();

		try {
			t.execute(-10);
			System.out.println("safe"
					+ "");
		}catch(SampleException e) {
			System.out.println("Unsafe");
		}
	}
}
