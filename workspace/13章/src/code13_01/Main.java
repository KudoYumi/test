package code13_01;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		King k = new King();

		h.setName("ごんべえ");
		/* setNameの赤文字name「ごんべえ」をHeroメソッド18行目にて
		 * 青文字nameに代入して、
		 * 青文字nameを　「みなと」から「ごんべえ」に初期化した。
		 * だから、結果は　「ようこそ勇者ごんべえ」になる。
		 */

		k.talk(h);
	}

}
