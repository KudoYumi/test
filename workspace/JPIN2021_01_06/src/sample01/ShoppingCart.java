package sample01;

public class ShoppingCart {
	private Order[] orders = new Order[10];
	private int index;

	public ShoppingCart(Order[] orders,int index) {
		this.orders = orders;
		this.index = index;
	}

	public ShoppingCart() {}


	public void add(Order order) {
		orders[index] = order;
		index++;
	}

	public int getTotal() {
		int total = 0;
		for(int i=0; i<index; i++) {
			total += orders[i].getTotal();
		}
		return total;
	}
}
