package youtube07_3;

public class Sample {
	public void test(String val) throws Exception,IllegalArgumentException{
/* この[throws 検査例外の名前]という宣言により、
 * このtestメソッドは、こんな種類の例外をthrowするかもしれない
 * という可能性を示唆するための宣言。
 *
 */
		if(val==null) {
			throw new Exception();
		}
		if(val.equals("")) {
			throw new IllegalArgumentException();
		}

		System.out.println("do something");
	/* 4行目の
	 * throws Exception,IllegalArgumentException
	 * という部分の宣言の意味は、
	 * このtestメソッドを実行すると、
	 * Exceptionクラスのインスタンスへの参照がthrowされるかもだし、
	 * IllegalArgumentExceptionクラスのインスタンスへの参照が
	 * throwされるかもしれないってこと。
	 *
	 */
	}

	/* (まとめ)
	 * IllegalArgumentExceptionのような非検査例外の場合は、
	 * catchブロック不要のため、
	 * メソッドにthrows IllegalArgumentException宣言不要だが(書いてもいい)、
	 *
	 * Exception系は検査例外のため、
	 * 必ずtry-catchしないといけないため、
	 * throws宣言は必須！！
	 *
	 */
}
