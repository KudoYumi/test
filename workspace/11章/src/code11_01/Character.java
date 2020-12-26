package code11_01;

public class Character {
	String name;
	int hp;

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}


	//戦う
	public void attack(Matango m) {

	}


	//死んだ
	public void die() {
		if(this.hp<=0) {
			System.out.println(this.name + "は死亡した");
		}

	}
}
