package staticについて02;

public class Singleton {
	private static Singleton instance;
	private String value;

	private Singleton() {}
	/* コンストラクタを非公開にしてしまったから、
	 * 外部でnewできなくなった。
	 * ではどうインスタンス化するのか？
	 * → public staticなメソッド。
	 */
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	/* staticだからインスタンス生成しなくても使えるメソッド。
	 * しかもpublicだから外部に公開のメソッド。
	 */

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
