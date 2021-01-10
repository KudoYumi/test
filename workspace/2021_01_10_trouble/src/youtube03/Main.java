
package youtube03;

public class Main {

	public static void main(String[] args) {

		int num = 0;
		try {
			Object obj = null;
			System.out.println(obj.toString());
	/* 参照先ないのにtoStringメソッド呼び出そうとしてるので
	 * ここが例外発生ポイント。
	 */

			num++;

		}catch(NullPointerException ex) {
			System.out.println("復帰完了");
		}
		System.out.println("OK");
		System.out.println(num);
	}
	/* 11行目で例外発生するようなコードあるが、
	 * 16行目のインクリメントは実行されるのかどうか。
	 *
	 * (結論)実行されない。
	 * 必ず11行目で例外が発生するから
	 * それ以降のコードは実行されない。
	 *
	 * 例外発生したらそれ以降のtryブロックのコードは実行されずに
	 * 即座にcatchブロックに移る。
	 * だからnumは0と出力される。
	 */

}
