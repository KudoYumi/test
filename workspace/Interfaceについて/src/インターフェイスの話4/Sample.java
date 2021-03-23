package インターフェイスの話4;

public interface Sample {
	int NUM = 10;

	/* 元々のinterfaceの目的は型情報だけを提供すればいい
	 * から「どんな種類の機能持ってるか」てことだけ
	 * 定義できるから、
	 * 抽象メソッドだけを定義可能。
	 *
	 *
	 * staticな公開された定数なら定義可能。
	 * 上記みたいなフィールドだと
	 * コンパイラが勝手にpublic static final int NUMと追加。
	 */

	public void hoge(); //interfaceにはpublicなメソッドだけ定義可能
	//この場合はコンパイラによってabstractが追加されてる。


	/* 型と実装に分けた時の型情報のみしか持たないから
	 * interfaceのインスタンスは動かない＝newできない、インスタンス化できない。
	 * interfaceを動かそうとすると、
	 * このinterfaceという型(規約)に従ったクラスを作らないといけない。
	 */
}
