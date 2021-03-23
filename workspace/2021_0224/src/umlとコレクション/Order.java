package umlとコレクション;

class Order {
	private int qty;
	private Item item;

	public Order(Item item,int qty) {
		this.item = item;
		this.qty = qty;
	}

	public int getTotal() {
		return this.item.getPrice()*qty;
	}
}
