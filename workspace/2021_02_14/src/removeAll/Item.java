package removeAll;

public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Item(String name) {
		this.name = name;
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	} */

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Item) {
			if(((Item)obj).name == this.name) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}



}
