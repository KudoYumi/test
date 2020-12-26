package code10_05;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.run();


		SuperHero sh = new SuperHero();
		sh.run();
		/* 先ほどのcode_10_03ではMinatooが反映されてなかったけど、
		 * なぜこちらでは反映されているのか。
		 * それは見てるとこが違うから。
		 * h.run()はHeroクラスのrun()、sh.run()はSuperHeroクラスのrun()だから。
		 * だから　※「フィールドはオーバーライドさせない。」
		 */

	}

}
