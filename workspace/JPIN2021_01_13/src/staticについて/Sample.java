package staticについて;

public class Sample {
	public static void main(String[] args) {

		A.num = 10;
	//numはstatic変数だからインスタンス生成してなくても呼び出せる。

	//同様にhello()もstaticだからインスタンス生成してなくても動かせる。
		A.hello();
	/* インスタンスを生成してなくても使えるのが、
	 * staticと非staticの違いといえる。
	 *
	 * インスタンス変数valueや、
	 * インスタンスメソッドのtestメソッドは、
	 * A.value = 100;
	 * A.test();　とかやるとエラー。
	 */
		A a = new A();
		a.value = 10;
		a.test();

	/* 当然インスタンスaを使ってstaticなものにアクセスもできるが、
	 * 実際には以下のようにコンパイラが自動で変換してる。
	 */
		a.num = 100; // →A.num = 100;
		a.hello();   // →A.hello();


	/* インスタンスごとに異なる値をもたせて、
	 * 異なる振る舞い方をさせたいから。
	 * 非staticなるものがある。
	 *
	 * オブジェクト指向的には、staticな変数は使うべきではない。
	 * ただあったほうが便利なこともあるから、
	 * staticなもが用意されてる。
	 *
	 * インスタンスごとに異なる値を持たせる必要ない時、
	 * やいちいちインスタンス生成したくないときとかに
	 * staticを使うとメモリも要領くわないしいい。
	 */
	}
}
