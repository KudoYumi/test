package code05_04;

public class Main {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");

		hello("湊");
		hello("浅香");
		hello("菅原");

		System.out.println("メソッドの呼び出しが終了");
	}


	public static void hello(String name) {
		System.out.println(name+ "さん、こんにちわ");
	}
}
