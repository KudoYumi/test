package code10_EX2_2;

public class Main {

	public static void main(String[] args) {
		Child ch = new Child();

		ch.age = 20;
	/* Childクラスにはフィールドageない。
	 * だから、Parentsのフィールドageに20代入したことになる。
	 */

		System.out.println(ch.getAge());
	/* ChildのgetAgeメソッド動作させる。
	 * でもChildの7行目のthis.ageって言ってるのに
	 * Childクラスにフィールドageがない。
	 * 継承先一個内側の親のフィールドでage探す。 という動き。
	 */

	}

}
