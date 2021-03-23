package jpin1月6日分01;

public class Test {
	public static void main(String[] args) {

		Item apple = new Item("apple",100);
		Item banana = new Item("banana",80);
		Item orange = new Item("orange",120);


		Order o1 = new Order(apple,3);
		Order o2 = new Order(banana,5);
		Order o3 = new Order(orange,2);


		ShoppingCart cart = new ShoppingCart();
		cart.add(o1);  //変数o1使わず、cart.add(new Order(apple,3)) でもいい。
		cart.add(o2);
		cart.add(o3);


		System.out.println(cart.getTotal());
	}
}
