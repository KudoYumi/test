package 白本9_13;

public class Item {
	int price;
	String name;

	public Item(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "値段:" + price + ",名前:" + name + "]";
	}

}
