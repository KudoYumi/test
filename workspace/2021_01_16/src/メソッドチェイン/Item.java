package メソッドチェイン;

public class Item {

	private String name;
	private String id;
	private int price;


	public Item name(String name) {
		this.name = name;
		return this;
	}

	public Item id(String id) {
		this.id = id;
		return this;
	}

	public Item price(int price) {
		this.price = price;
		return this;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", id=" + id + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof Item) {
				if(((Item)obj).id == this.id &&
						((Item)obj).name == this.name) {
					return true;
				}
			}
		}
		return false;
	}

	public String getId() {
		return id;
	}


}
