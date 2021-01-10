package youtube07_2;

public class Sample {
	public void test(String val) {

		if(val==null) {
			throw new Exception();
	/* コンパイルエラーになってる理由
	 * ①Exception型のものだから、検査例外。
	 * 検査例外は、try-catchを強制しないといけない例外クラス。
	 * だから、検査例外の場合は、
	 * 検査例外が発生しうるメソッドに対して、
	 * 「例外を発生させるメソッド」と宣言しないといけない。
	 * そこで出てくるのがthrows宣言。→youtube07_3へ
	 */
		}

		System.out.println("do something");
	}
}
