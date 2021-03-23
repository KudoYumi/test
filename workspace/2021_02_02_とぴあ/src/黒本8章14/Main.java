package 黒本8章14;

public class Main {
	public static void main(String[] args) {
		A a = new A(10);
		B b = new B(10);

		System.out.println(a.equals(b));

	/* 明らかにAとBに継承関係もなんもないのに
	 * どうしてコンパイルエラーじゃなくて、
	 * 例外が発生するの？→
	 * 実行されてから、Aのクラス定義のequalsメソッドの内容見に行くから？
	 */
	}
}
