package youtube07;

public class Sample {
	public void test(String val) {

		if(val==null) {  //受け取った引数がnullだったら例外を投げる
			IllegalArgumentException ex = new IllegalArgumentException();
			/* これで例外クラスのインスタンスを生成した。
			 * つまり、報告書を生成した。
			 * これを呼び出し元に報告する、　
			 * 呼び出し先に投げてあげないといけない。
			 */

			throw ex; //この１文で報告書を渡したことになる。
		}
	/* 基本は上記の書き方だが、
	 * インスタンスの生成と、throwを同時に行い、
	 * 2行のコードを1行にまとめてもいい。
	 * それをSamクラスに定義しなおす。→Samクラスへ
	 */
	}
}
