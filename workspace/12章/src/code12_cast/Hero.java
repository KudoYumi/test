package code12_cast;

public class Hero extends Character{
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");

		System.out.println("敵に10のダメージを与えた");
		m.hp -= 10;
	}

}
