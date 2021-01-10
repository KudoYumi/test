package youtube_equals3;

public class Sample {
	public static void main(String[] args) {
		Item a = new Item(100,"apple");
		Item b = new Item(100,"appl");

		System.out.println(a==b); //異なるインスタンスだからfalse
		System.out.println(a.equals(b)); //オーバーライドした後

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

		System.out.println(a.hashCode()==b.hashCode());
	/* bのnameがaのnameと異なるため、
	 * hash関数で出てくる結果は異なる。
	 */

	/* Javaのルールによって
	 * equalsメソッドと、hashCodeは必ずセットで扱う。
	 */
	}
}
