package youtubeラムダの話8_2;
// メソッドチェインについて

public class Main {
	public static void main(String[] args) {
		Item item = new Item()
					.id("A100")  // new Item().id("")でidセットされ自分の参照戻り、
					.name("B100G") //さらにそのnameメソッドでnameフィールドセットされ、また自分の参照戻り
					.description("sample") //同様にその参照先のdescriptionメソッドでフィールドセットされ、、、
					.price(1000);
	}

	/* このように何度も自分の参照を戻して、フィールドの値セットして
	 * また参照戻して～～～てやるこの作業を
	 * メソッドチェインという。
	 */
}
