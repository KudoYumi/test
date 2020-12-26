package code10_11;

public class Main {

	public static void main(String[] args) {

		Weapon w = new Weapon("きれるけん",20);
	/*Weaponクラスの19行目の引数がString型2個のもの呼び出し、
	 *親クラスの13行目のとこに引き渡される。
	 */
		System.out.println(w.price);
		System.out.println(w.name);



		Weapon a = new Weapon();
		System.out.println(a.name);
		System.out.println(a.price);
	}

}
