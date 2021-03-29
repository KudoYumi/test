package interfaceとcast2;

public class Test {
	public static void main(String[] args) {
		X x1 = new X();

		X x2 = new Y();

		((A)x1).show();
	//コンパイルは通ってしまうがx1はXのインスタンスのため例外発生
	//例外の起きないようなコードをver3のパッケージに記述

	//この場合x1の中身の参照先がYのインスタンスであるなら実行も正常に行える。
	}
}
