package 白本10_40_いけいないやつ;

public class Test {
	public static void main(String[] args) {
		Fruit f = new Orange();

		f.foo(); //動作するのはサブの方のfoo
	/* スーパークラスの方では例外発生するなんて言ってないのに
	 * サブで発生している。
	 * 非検査例外ゆえに、
	 * コンパイラがエラー出さないが、
	 * 本来の原則に従うと、
	 * スーパーで発生してる例外よりも
	 * 親クラスの例外が発生するようなコードはダメ！！
	 */
	}
}
