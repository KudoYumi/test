package 黒本10_14;

public class Item {
	String name;
	int price = 100;

	public static void main(String[] args) {
		Item p1 = new Item("apple");
		Item p2 = new Item("banana",200);

		System.out.println(p1);
		System.out.println(p2);
	}

	public Item(String name) {
		this();
		this.name = name;
	}

	public Item() {}

	public Item(String name,int price) {
		this(name);
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + price;
	}
}
