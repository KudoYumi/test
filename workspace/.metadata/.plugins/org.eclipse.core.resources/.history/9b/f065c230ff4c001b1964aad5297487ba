package youtubeラムダの話8_2;

public class Item {
	private String id;
	private String name;
	private String description;
	private int price;

	// デフォルトコンストラクタだけが追加されるようにした。
	// メソッドチェインを用いてもっとエレガントに！


	public Item id(String id) {
		this.id = id;
		return this; //thisは自分自身の参照そのもの
	}

	public Item name(String name) {
		this.name = name;
		return this;
	}

	public Item description(String description) {
		this.description = description;
		return this;
	}

	public Item price(int price) {
		this.price = price;
		return this;
	}
	/* 自分のpriceメソッド呼ばれたら
	 * 呼び出し元に自分の参照を戻す。
	 * これを使って呼び出し元でメソッドチェインを作れる。
	 */

}
