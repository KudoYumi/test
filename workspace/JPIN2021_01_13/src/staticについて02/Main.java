package staticについて02;

public class Main {
	public static void main(String[] args) {

	/* Singletonクラスのコンストラクタはprivateだから
	 * ここでnewはできない。
	 *
	 * 外部のクラスであるこのMainがSingletonのインスタンスを
	 * 手に入れようと思ったら、
	 * getInstanceメソッド使わざるを得ない状態。
	 * (getInstanceとgetter、setterしか公開されてないから。)
	 *
	 * こうやってどこからでもインスタンスを生成できないようにして、
	 * できることを限定している設計といえる。
	 */

		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();

		a.setValue("hello");
		System.out.println(b.getValue());
		System.out.println(a.getValue());

	// 詳しくはノート
	/* aにもbにも同じインスタンスへの参照が代入されてる。
	 * つまり、インスタンスがただ1つしかない状態が保障された設計。
	 *
	 * インスタンスごとに異なる値をもたせなくていいような場合、
	 * インスタンスがただ1個しかないような設計にしておくと、
	 * その分だけパフォーマンス上がる。
	 *
	 * こういう設計は結構使われてる。
	 * 勝手にたくさんnewされないようになってる。
	 */
	}
}
