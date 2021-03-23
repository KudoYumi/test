package 白本10_40;

public class Test {
	public static void main(String[] args) {
		Fruit f = new Orange();

		try{
			f.foo(); // Fruitは検査例外throwするから
		}catch(Exception e) {

		}
	}
}
