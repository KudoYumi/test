package code09_10;

public class Hero {
	String name;
	int hp;

		public Hero(String name) { //コンストラクタ①
			this.hp = 100;
			this.name = name; //因数でnameフィールド初期化
		}

		public Hero() { //コンストラクタ②
			this("ダミー");
			//先頭に記述！この前に
			// int a=0; this("ダミー");てしたらエラー
		}

}
