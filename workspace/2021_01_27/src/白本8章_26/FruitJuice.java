package 白本8章_26;

public class FruitJuice {
	public static void main(String[] args) {
		Banana b = new Banana();

		try {
			b.add();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
