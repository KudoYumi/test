package castExcep2;

public class Main {
	public static void main(String[] args) {
		A a = new A(10);
		B b = new B(10);

		System.out.println(a.equals(b)); //AはBのスーパークラスだからtrue
	/* でもBはAのサブクラスだから
	 * Bのequalsメソッドの定義より、
	 * キャスト式によってコンパイルは通るが、
	 * b.equals(a)は不正なダウンキャストによって例外発生
	 */
		System.out.println(b.equals(a));

	}
}
