package youtube04;

public class Main {
	public static void main(String[] args) {
		int num = 0;

		try {
			Object obj = "sample";
			System.out.println(obj.toString());

			num = num/0;

		}catch(NullPointerException ex) {
			System.out.println("復帰完了");

		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticExceptionをキャッチ");

		}finally {
			System.out.println("finally");
		}


		System.out.println(num);
	}
	/* 流れ的にはnum/0のとこで例外発生して、
	 * ArithmeticExceptionのcatchブロックに到達して、
	 * finallyブロックに行って、
	 * 最後に24行目のnumの出力
	 * という流れ。
	 */
}
