package code12_04;

public class Main {

	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c = w; //箱cに代入

		Matango m = new Matango();

		c.name = "あさか";
		c.attack(m);
//		c.fireball(m);
		//7行目の影響で箱cの中身がWizardであることがわからないからエラー。
		//Characterクラスにfireball()があれば大丈夫

	}

}
