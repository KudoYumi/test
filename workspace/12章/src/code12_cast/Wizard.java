package code12_cast;

public class Wizard extends Character{
	int mp;

	public void attack(Matango m) {
		System.out.println(this.name+"の攻撃");
		System.out.println("敵に３のダメージ");
		m.hp -= 3;
	}

	public void fireball(Matango m) {
		System.out.println(this.name+"は炎の玉はなった");
		System.out.println("敵に２０ダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
}
