package overrideの例外;

public class Second extends First{

	@Override
	public Second create() {
		return new Second();
	}
	/* 親クラスでは戻り値の型はFirst
	 * これがオーバーライドの例外で、
	 * 戻り値の型がオブジェクト型なら、
	 * サブクラスにてオーバーライドするとき、
	 * メソッドの戻り値の型を　サブクラス型にしてもいい。
	 */
}
