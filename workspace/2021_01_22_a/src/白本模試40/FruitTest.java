package 白本模試40;

public class FruitTest {
	public static void main(String[] args) {
		Fruit f = new Orange();
		try{
			f.foo();
		}catch(Exception e) {
			System.out.println("例外");
		}
	}
}
