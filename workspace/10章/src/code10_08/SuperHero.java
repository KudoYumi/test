package code10_08;
//　継承　extendsをつかう

public class SuperHero extends Hero{  //継承するとHeroクラスのすべての条件を持ってる→便利！
	String name ="Minatoo";

	boolean flying; //追加した



	//飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}

	public void run() {
		System.out.println(this.name + "は撤退した");
	}


	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");

		if(this.flying) {
			System.out.println(this.name + "の攻撃");
			m.hp -= 5;
			System.out.println("５ダメージ与えた");
		}
	}


}
