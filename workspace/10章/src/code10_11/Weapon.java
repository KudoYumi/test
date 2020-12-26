package code10_11;

public class Weapon extends Item{
	public Weapon() {
		super("めっちゃ珍しい剣",30);
	}
		/* super() 引数なしだとエラー
		 * 親クラスのItemクラスで引数あるものしか定義してないから。
		 */

		/*
		super("珍しい剣");
		super("ただの剣",50);
		とかだと二つ目のsuper("ただの剣",50)の前にすでに宣言があるからエラー。
		必ず先頭！！でがルールで、二つは書けない。
		*/



	public Weapon(String name,int price) {
		super(name,price);
	}

}
