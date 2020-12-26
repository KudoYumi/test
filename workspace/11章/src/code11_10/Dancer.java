package code11_10;

public class Dancer extends Character {


	public void dance() {
		System.out.println(this.name + "は踊った");
	}

	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に３ダメージ");
		m.hp -= 3;
	}

}
