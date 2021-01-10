package youtube03;

public class Main3 {
	public static void main(String[] args) {
		int num = 0;

		try {
			Object obj = "sample";
			System.out.println(obj.toString());

			num = num/0;

		}catch(NullPointerException ex) {
			System.out.println("復帰完了");

		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticExceptionをキャッチ");
		}
		System.out.println(num);

	/* このようにcatchブロックをつなげることで
	 * 例外発生したときに、トラブルの種類に応じて、
	 * どのcatchブロックで対応するのか、
	 * 役割を振り分けることができる。
	 */
	}
}
