package equalsの復讐;

public class Main {
	public static void main(String[] args) {
		Item item1 = new Item()
							.name("アセロラ")
							.color("赤い")
							.price(500);
		//メソッドチェイン利用

		Item item2 = new Item()
							.name("アセロラ")
							.color("赤い")
							.price(300);

		System.out.println(item1==item2);
		System.out.println(item1.equals(item2));

	}
}
