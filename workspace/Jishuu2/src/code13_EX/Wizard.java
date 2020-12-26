package code13_EX;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	void heal(Hero h) {
		int basePoint = 10;

		int recovPoint = (int)(basePoint * this.wand.getPower());//getPower


	}

}
