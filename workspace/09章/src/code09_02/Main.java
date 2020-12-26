package code09_02;


public class Main {

	public static void main(String[] args) {
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;

		Hero h2;
		h2 = h1; //h1の番地をh2へコピー
		h2.hp = 200; //そのhp要素に入ってる数値を200で初期化　つまりh1のhp要素も200
		System.out.println(h1.hp);

	/*	Hero h2; //勇者h2を定義
		h2 = new Hero(); //この行がないとエラー。どこを見るのかわからないから。
		h2.hp = 200;
		h1 = h2;
		System.out.println(h1.hp);
	*/

	}

}
