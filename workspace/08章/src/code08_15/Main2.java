package code08_15;

public class Main2 {

	public static void main(String[] args) {
		//勇者を生成し初期化
		Hero h = new Hero();
		h.name = "みなと";
		h.hp = 100;


		//キノコAを生成し初期化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';


		//キノコBを生成し初期化
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';


		//冒険
		h.slip();
		m1.run();
		m2.run();
		h.run();

	}

}
