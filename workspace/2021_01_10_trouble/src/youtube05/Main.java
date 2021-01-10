package youtube05;

public class Main {
	public static void main(String[] args) {
		int num = 0;

		try {
			Object obj = "sample";
			System.out.println(obj.toString());

			num = num/0;

	/*	}catch(NullPointerException ex) {
			System.out.println("復帰完了");

		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticExceptionをキャッチ");
	*/

		}finally {
			System.out.println("finally");
		}

	/* catchブロックを削っても
	 * コンパイルエラーにはならない。
	 * tryブロック書いたらfinallyは必ず必要！
	 *
	 * 上記のcatchブロックはなくても、
	 * コンパイルエラーにならないから(実行時エラーは起きる)、
	 * NullPointerExceptionやArithmeticExceptionなどは
	 * 非検査例外といえる。
	 *
	 * もしも検査例外が発生するようなコードを
	 * tryブロックに書いていたら、
	 * 途端にコンパイルエラー。
	 */

		System.out.println(num);
	}
}
