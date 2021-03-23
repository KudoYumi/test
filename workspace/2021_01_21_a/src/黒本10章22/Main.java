package 黒本10章22;

public class Main {
	public static void main(String[] args) {
		Item a = new Item(1,"pen");
		Item b = new Item(1,"pen");

		/* どう見ても同じデータ内容だけど
		 * Itemクラスでequalsメソッドオーバーライドしてないから、
		 * a.equals(b)は同一性の判定なまま。よってfalse
		 */

		System.out.println(a==b); //参照先違うから
		System.out.println(a.equals(b));

		//ただ以下はtrue
		System.out.println(a.id==b.id); //プリミティブ型の判定だから
		System.out.println(a.name == b.name); //String型だからコンスタントプールに

		/* ただし以下のようにしたらfalse
		 * なぜならコンスタントプールに文字列penを作成するんでないから。
		 */
		Item i1 = new Item(10,new String("Pen"));
		Item i2 = new Item(10,new String("Pen"));

		System.out.println(i1.name==i2.name);

		//Stringクラスはラッパークラスだからequalsはtrue
		System.out.println(i1.name.equals(i2.name));
	}
}
