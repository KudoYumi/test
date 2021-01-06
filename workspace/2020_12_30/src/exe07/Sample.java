package exe07;

public interface Sample {
	public static final int num = 10; //インタフェイスは定数ならフィールドに指定可能

	void hoge();
	//public abstractは省略

	/* protectedはダメ！
	 * publicな抽象メソッドだけがinterfaceには定義できる。
	 *
	 */
}
