package sample01;

public class Test {
	public static void main(String[] args) {

		Order order1 = new Order(new Item("アップル",300),10);
		//100円のアップルを10個買った。

		Order order2 = new Order(new Item("オレンジ",200),20);
		//200円のオレンジを20個買った。

		Order order3 = new Order(new Item("バナナ",100),10);


		Order[] orders = {order1,order2,order3};

		ShoppingCart sc = new ShoppingCart(orders,3);
		System.out.println(sc.getTotal());

	}
}
