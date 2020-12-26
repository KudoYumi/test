package code10_Ex;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "みなと";
		h.hp = 1000;

		PoisonMatango pm = new PoisonMatango('X');
		pm.attack(h);

		if(h.hp<=0) {
			h.die();
		}

		pm.attack(h);

	/* h.hp<=0まで攻撃を繰り返し、0以下になったらdieメソッド動作させたい。
	 * 何回やるかわからないから、for文は使えない。
	 * do-whileでやる。
	 */
	}

}
