package code13_01;

public class Hero {
	private int hp;
	private String name = "みなと";
	Sword sword;


	public String getName() {
		return this.name;
		/*このgetNameメソッドを作ることで、
		 * 上記の制限付きnameフィールドへアクセス可能S
		 */
	}

	public void setName(String name) {
		this.name = name;
	}

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}

	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVER");
	}

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した");
	}

	public void attack(Matango m) {
		System.out.println(this.name +"の攻撃");

		System.out.println("キノコ" + m.suffix + "から2ポイントの反撃受けた");
		this.hp -= 2;

		if(this.hp<=0) {
			this.die();
		}
	}
}
