package 黒本10_15;

public class Item {
	String name;
	int price;

	public Item(String name, int price) {
		this(name);
		this.price = price;
	}

	public Item(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price + "]";
	}

}
