package code09_04;

public class Wizard {
	String name;
	int hp;

	public void heal(Hero h) {
		if(this.hp >= 10) {
			h.hp += 10;
			this.hp -= 10;

			System.out.println(h.name +"のHPを10回復した");
			System.out.println(this.name + "のHPは10減った");
		}else {
			System.out.println("回復できない！");
		}

	}
}
