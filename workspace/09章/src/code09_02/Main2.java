package code09_02;

public class Main2 {

	public static void main(String[] args) {
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;



		Hero h2; //勇者h2を定義
		h2 = new Hero(); //この行がないとエラー。どこを見るのかわからないから。
		h2.hp = 200;
		h1 = h2;
		System.out.println(h1.hp);
	}

}
