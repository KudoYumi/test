package umlとコレクション2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Order> orders = new ArrayList<Order>();

	public void add(Order order) {
		this.orders.add(order);
	}

	public int getTotal() {
		int total = 0;

		for(Order order : orders) {
			total += order.getTotal();
		}
		return total;
	}
}
