package 黒本8章14自分で改造;

public class Main {
	public static void main(String[] args) {
		A a = new A(10);
		B b = new B(10);


		System.out.println(a.equals(b));//数字が一緒でBはAのサブクラスゆえtrue

		System.out.println(b.equals(a));
		/* フィールドの数字一緒だけど、
		 * スーパークラスのインスタンスをダウンキャストしてる。
		 * 文法上は問題ないけど、
		 * CastException発生するはず→例外じゃなくfalseと出てくる。
		 *
		 * あれ？
		 * b.equals(a)のとこで、
		 * B b = (B)a ていうダウンキャストしてるのに
		 * なんで例外発生しないの？ →
		 * Bのequalsのif文がそもそも実行されてないから。
		 */
		
		
	}
}
