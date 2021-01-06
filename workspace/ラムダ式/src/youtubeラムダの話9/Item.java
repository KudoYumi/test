package youtubeラムダの話9;

import java.util.function.Consumer;

public class Item {
	private String id;
	private String name;
	private String description;
	private int price;


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

	public static void save(Consumer<Item> con) {
		Item item = new Item();
		con.accept(item); //Itemインスタンス生成してConsumerに渡す
		System.out.println("save:"+item);
	}
	/* つまりからのインスタンスを生成して
	 * その空のインスタンスへの参照をacceptに渡してる。
	 *
	 * いまConsumer型、関数型interfaceなので
	 * ラムダ式にこの空のItemインスタンスが渡されてくる。
	 */

	@Override
	public String toString() {
		return "Item [id="+id+", name="+name+", description="+description+", price="+price+"]";
	}
}
