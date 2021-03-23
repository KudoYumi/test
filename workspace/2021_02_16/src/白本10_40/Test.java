package 白本10_40;

public class Test {
	public static void main(String[] args) {
		Fruit f = new Orange();
		try {
			f.foo();
		}catch(Exception e) {
			System.out.println("正常に復帰");
		}
	}
}

