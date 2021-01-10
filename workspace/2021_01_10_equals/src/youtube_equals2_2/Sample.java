package youtube_equals2_2;

public class Sample {
	public static void main(String[] args) {
		Item a = new Item(100,"apple");
		Item b = new Item(100,"orange");

		System.out.println(a==b); //異なるインスタンスだからfalse
		System.out.println(a.equals(b)); //オーバーライドした後

	/* idさえ一致すれば同じ内容、
	 * とequalsメソッドをオーバーライドしたから、
	 * 名前が違ってもtrue。
	 */
	}
}
