package code12_08;

public class Hero extends Character{

	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 100;
		System.out.println("敵に100ダメージ");
	}

	public void attack(Goblin g) {
		g.hp -= 100;
		System.out.println("ゴブリンに100ダメージ");
	}
}
