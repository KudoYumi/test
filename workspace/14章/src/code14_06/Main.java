package code14_06;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "みなと";
		h1.hp = 100;

		Hero h2 = new Hero();
		h2.name = "みなと";
		h2.hp = 100;

		if(h1.equals(h2)) {
		/* デフォルトのObjectクラスのequalsメソッドでは等値
		 * だから　等価の判定したいなら自分で
		 * equalsメソッドを等価判定できるようにオーバーライドする。
		 *
		 * いまはデフォルトのままだから、equals使っても等価判定扱い。
		 */
			System.out.println("同じ内容");
		}else {
			System.out.println("違う内容");
		}

	}

}
