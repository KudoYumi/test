package code09_03;
// 9-4
public class Main {

	public static void main(String[] args) {
		Sword s = new Sword(); // 変数sを定義
		s.name = "炎の剣";
		s.damage = 10;

		Hero h = new Hero(); //勇者hを生成
		h.name = "みなと"; //勇者hの名前は　みなと、と定義
		h.hp = 100; //hのhpは100と初期化
		h.sword = s; //hのswordはs

		System.out.println("現在の武器は" +h.sword.name);

		System.out.println
		(h.name +"は"+ h.sword.name +"で攻撃し"+ h.sword.damage +"与えた");
		// 数学の代入法と同じ原理

	}

}
