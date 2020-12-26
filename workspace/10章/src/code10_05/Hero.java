package code10_05;


public class Hero {

	String name ="みなと";
	int hp = 100;

	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}


	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はこけて5のダメージ");
	}

	//逃げる
	public void run() {
		System.out.println(this.name +"は逃げた");
	}


}
