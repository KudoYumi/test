package youtube09;

public class B {

	public void hello() throws SampleException{
		throw new SampleException();
	/* 6行目で例外をthrowすると書いてるし、検査例外だから、
	 * メソッドの宣言のとこで、
	 * throws宣言ないとコンパイルエラー。
	 */

	}
}
