package 黒本04;
//初期化ブロック
/* すべてのコンストラクタの前処理として記述可能。
 * そのためコンストラクタよりも前に実行される。
 */

public class Main {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample("アンドレア");

	}
}
