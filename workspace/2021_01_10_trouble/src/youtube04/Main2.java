package youtube04;

public class Main2 {
	public static void main(String[] args) {
		int num = 0;

		try {
			Object obj = "sample";
			System.out.println(obj.toString());

	//		num = num/0; ←この例外コードなかったら

		}catch(NullPointerException ex) {
			System.out.println("復帰完了");

		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticExceptionをキャッチ");

		}finally {
			System.out.println("finally");
		}


		System.out.println(num);
	}
	/* この場合は、
	 * tryブロックにて例外が発生しないから、
	 * catchブロックにはいかず、
	 * tryブロックのコードがすべて実行され、
	 * finallyブロックが実行されて、
	 * 24行目のコードが実行される。
	 */
}
