package メソッドチェインとequalsの融合コード自前;

public class Main {
	public static void main(String[] args) {

		Item a = new Item().id(1001)
						   .name("オレンジ")
						   .color("黄色")
						   .price(100);

		Item b = new Item().id(1001)
						   .name("オレンジ")
						   .color("朱色")
						   .price(150);

		System.out.println(a==b); //当然異なるインスタンスへの参照のためfalse
		System.out.println(a.equals(b)); //idとname等しいからtrue
		//hash関数でも比較できる
		System.out.println(a.hashCode()==b.hashCode());


	// 配列を考えてみる
		Item[] items =
			{ new Item().id(997).name("apple").color("赤").price(120).qty(5),
			  new Item().id(998).name("banana").color("黄色").price(98).qty(10),
			  new Item().id(999).name("peech").color("ピンク").price(100).qty(6),
			  new Item().id(1000).name("melon").color("緑").price(400).qty(3)
			 };


		for(Item i:items) {
			System.out.println(i.getTotal());
		}
	}
}
