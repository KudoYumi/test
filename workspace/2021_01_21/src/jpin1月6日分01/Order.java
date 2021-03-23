package jpin1月6日分01;

public class Order {
	private Item item;
	private int qty;

	public Order(Item item,int qty) {
		this.item = item;
		this.qty = qty;
	}

	public int getTotal() {return item.getPrice()*qty;}
}
