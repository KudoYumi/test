package sample01;

public class Test2 {
	public static void main(String[] args) {
		Item apple = new Item("apple",100);
		Item banana = new Item("banana",80);
		Item orange = new Item("orange",120);

		Order order1 = new Order(apple,3);
		Order order2 = new Order(banana,5);
		Order order3 = new Order(orange,2);
	}
}
