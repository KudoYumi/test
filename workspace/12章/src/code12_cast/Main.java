package code12_cast;

public class Main {

	public static void main(String[] args) {
		Character c = new Wizard();
		c.name = "すがわら";

		Matango m = new Matango();
		c.run();

		if(c instanceof Wizard) {
			Wizard w = (Wizard)c;
			w.fireball(m);
		}
		// この場合cがWizardのため、ifの条件演算子()がtrueとなり、代入できる


	/*	if(c instanceof Wizard) {
			Hero h = (Hero)c;
			h.attack(m);
		}
			これだとエラー*/

	}

}
