package exe06;

public final class Item {
	private final String name;
	private final int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	/*たとえばここで以下のようなメソッド追加すると
	public void modify(String name,int price) {
		this.name = name;
		this.price = price;
	}
 		これでデータの内容変わってしまう。
 		こういうことしたくない。

    *
    */
}
