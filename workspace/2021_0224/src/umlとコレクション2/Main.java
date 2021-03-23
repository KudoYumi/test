package umlとコレクション2;

public class Main {
	public static void main(String[] args) {
		Item apple = new Item("apple",100);
		Item orange = new Item("orange",120);
		Item banana = new Item("banana",80);

		ShoppingCart cart = new ShoppingCart();
		cart.add(new Order(apple,3));
		cart.add(new Order(orange,2));
		cart.add(new Order(banana,4));

		System.out.println(cart.getTotal());
	}
}
