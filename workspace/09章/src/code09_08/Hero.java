package code09_08;

public class Hero {
	String name;
	int hp;
	Sword aword;


	public void attack() {
		System.out.println(this.name + "は攻撃した");
		System.out.println("敵に５ポイントダメージ");
	}

	public Hero() {
		this.hp = 100;  //hpフィールドを初期化
	}
}
