package youtube_equals2_2;

public class Item {
	private int id;
	private String name;

	public Item(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {return false;}
		if(obj instanceof Item == false) {return false;}
	/* 以上の条件でnullでもないし、Item型のインスタンスであることが
	 * 保障された。
	 *
	 * 次にやることは、
	 * 同じ値を持つかどうかの確認だが、
	 * それは以下の３通り考えられるから、
	 * どれをもって同じ値を持つというのか、
	 * きちんと自前で定義しなおす必要もある。
	 *
	 * ⓵ idのみ一致すればオッケーかどうか。
	 * ⓶ nameのみ一致すればオッケーかどうか。
	 * ⓷ idとname両方一致していてオッケーとするか。
	 *
	 * 今回は⓵のときオッケーと返すとする。
	 */

		if(this.id == ((Item)obj).id)  {
			return true;
		}

		return false;
	}
}