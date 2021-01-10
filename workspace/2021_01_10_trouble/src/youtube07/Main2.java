package youtube07;

public class Main2 {
	public static void main(String[] args) {

		Sam sample = new Sam();

		try{
			sample.test(null);

		}catch(IllegalArgumentException ex) { //Samクラスで生成したインスタンスをcatchする
			System.out.println(ex+"が発生した");
		}

	/* IllegalArgumentExceptionは
	 * 非検査例外のため、try-catch文がなくても、
	 * コンパイルエラーが発生しなかった。
	 *
	 * 検査例外の場合も考えてみる。→youtube07_2パッケージへ
	 */

	}
}
