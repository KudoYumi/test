package exe08;

public class SampleValue {
	private final int value;

	public SampleValue(int value) {
		this.value = value;
	}
	/* フィールドの値がfinalだから
	 * コンストラクタでインスタンス生成するタイミングで
	 * 初期化するとそれ以降変更不可。
	 * 変更不可だから、インスタンスの持ってる値は一定であることが保証される。
	 * これが不変オブジェクトのいいところ。
	 */



	//ただ値を変えたい場合は以下のような処理が必要。
	//新しいインスタンス型の参照戻さないといかんから、

	public SampleValue modify(int value) {
		return new SampleValue(value);
	}
	/* 新しいインスタンスを生成してそのインスタンスの参照を戻すって
	 * しておくと、
	 * 変更された値を持った新しいインスタンスの参照を戻す。
	 *
	 * これが不変オブジェクトの作り方。
	 */
}
