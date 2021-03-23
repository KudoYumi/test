package メソッドチェイン;

public class Main {

	public static void main(String[] args) {

		Item[] items = { new Item().name("リンゴ").id("E001").price(120),
						 new Item().name("オレンジ").id("E002").price(100),
						 new Item().name("桃").id("E003").price(180),
						 new Item().name("桃").id("E003").price(200),
						 new Item().name("スイカ").id("E004").price(500)};

		for(Item i:items) {
			System.out.println(i);
		}

		System.out.println(items[2]==items[3]);
		System.out.println(items[2].equals(items[3]));
	}
}
