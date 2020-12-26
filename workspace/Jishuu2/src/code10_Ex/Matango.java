package code10_Ex;


public class Matango {
	int hp = 50;
	char suffix;


	public Matango(char nm) {
		this.suffix = nm;
	}

	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("100ダメージ");
		h.hp -= 100;
	}
}
