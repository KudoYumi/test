package 白本7_21;

public class Item {
	int price;
	String name;

	public Item(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Item) {
			if( ((Item)obj).name == this.name
					&& ((Item)obj).price == this.price) {
				return true;
			}
		}
		return false;
	}
}
