package 白本模試40の解説方法1;

// 例外の発生ポイントのFruit自身が例外の処理
public class Fruit {
	void foo() {
		try{
			throw new Exception();
		}catch(Exception e) {
			System.out.println("catch");
		}
	}
}
