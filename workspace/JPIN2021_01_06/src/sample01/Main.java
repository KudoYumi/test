package sample01;

public class Main {
	public static void main(String[] args) {

		Item apple = new Item();
		apple.setName("apple");
		apple.setPrice(100);

		Item banana = new Item();
		banana.setName("banana");
		banana.setPrice(80);

		Item orange = new Item();
		orange.setName("orange");
		orange.setPrice(120);

		Order o1 = new Order();
		o1.setItem(apple);
		o1.setQty(3);

		Order o2 = new Order();
		o2.setItem(banana);
		o2.setQty(5);

		Order o3 = new Order();
		o3.setItem(orange);
		o3.setQty(2);

		ShoppingCart sc = new ShoppingCart();
	}
}
