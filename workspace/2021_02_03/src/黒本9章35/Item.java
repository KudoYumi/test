package 黒本9章35;

public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Item) {
			Item tmp = (Item)obj;

			if(tmp.name.equals(this.name) && tmp.price==this.price) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

}
