package 白本模試40の解説方法2;

public class Test {
	public static void main(String[] args) {

		try {
			Fruit f = new Orange();
			f.foo();
		}catch(Exception e) {
			System.out.println("例外処理");
		}finally {
			System.out.println("無事にポリモフィズム");
		}
	}

	/* きちんとポリモフィズム働かないから
	 * 例外をthrowする可能性のあるメソッドは、
	 * やたらにオーバーライドすべきでない、ってことかな？
	 *
	 * もしくはオーバーライドするなら、
	 * サブクラスのオーバーライドメソッドも例外発生するようにすべきってこと？
	 */
}
