package youtube07_3;

public class Main {
	public static void main(String[] args) {

		Sample sample = new Sample();

		try {
			sample.test(null);

		}catch(IllegalArgumentException ex) {
			System.out.println(ex);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
