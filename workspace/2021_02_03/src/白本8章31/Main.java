package 白本8章31;

public class Main {
	public static void main(String[] args) {
		Car truck = new Truck();

		try {
			truck.foo(); //オーバーライドしたものが呼ばれる

		}catch(Exception e) {
			System.out.println("検査例外処理");
		}
	}
}
