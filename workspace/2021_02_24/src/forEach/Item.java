package forEach;

class Item {
	int price;
	String name;

	public Item(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "price=" + price + ",name=" + name + ",";
	}

}
