package youtube03;

public class Main2 {
	public static void main(String[] args) {

		int num = 0;

		try {
			Object obj = "sample";
			System.out.println(obj.toString());

			num++;
		}catch(NullPointerException ex) {
			System.out.println("復帰完了");
		}
		System.out.println(num);
	}

	/* 10行目で例外は発生せず、
	 * インクリメントも実行されて、
	 * catchブロックにはいかずに
	 * このプログラムは完了する。
	 */
}
