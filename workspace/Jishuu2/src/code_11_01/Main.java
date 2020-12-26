package code_11_01;

public class Main {

	public static void main(String[] args) {
	//	Character c = new Character();

		Hero h = new Hero();
		h.name = "みなと";

		Matango m = new Matango('X');

		Dancer d = new Dancer();

		h.attack(m);
		d.attack(m);

	}

}
