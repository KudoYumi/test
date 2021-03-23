package メソッドチェインとequalsの融合コード自前;

public class Item {

	private int id;
	private String name;
	private String color;
	private int price;
	private int qty;

	static final double tax = 0.1;


	public Item id(int id) {
		this.id = id;
		return this;
	}

	public Item name(String name) {
		this.name = name;
		return this;
	}

	public Item color(String color) {
		this.color = color;
		return this;
	}

	public Item price(int price) {
		this.price = price;
		return this;
	}

	public Item qty(int qty) {
		this.qty = qty;
		return this;
	}


	//getter
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}



	//idとnameが同じとき、等値とする。
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
	// 異なるインスタンスでもidとnameが同じなら同値性とする
		if(obj!=null && (obj instanceof Item)) {
			if(((Item)obj).id == this.id && ((Item)obj).name==name) {
				return true;
			}
		}

		return false;
	}

	public int getTotal() {
		return (int)(price*qty*(1+tax));
	}

}
