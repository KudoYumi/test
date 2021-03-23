package 白本10章;

public class Main2 {
	public static void main(String[] args) {
		final int[] array = {10,20};
	//arrayの参照先を変更不可にした
	//arrayの中身は変更不可ではない。

		array[0] = 100;
		array[1] = 20;

	// arrayに異なる配列の参照先を代入してみるとエラー
	//	array = new int[4];


	}
}
