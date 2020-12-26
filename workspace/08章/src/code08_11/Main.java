package code08_11;


public class Main {

	public static void main(String[] args) {
		//1.仮想空間に勇者を生成
		Hero h = new Hero(); //new演算子

		//2.1で生成した勇者に初期値を与える
		h.name = "ゆみ";
		h.hp = 100;
		System.out.println("勇者" +h.name+ "を生み出した");

		//3.勇者メソッドを呼び出す。
		h.sit(5); //5秒座る
		h.slip();
		h.sit(25); //25秒座る
		h.run();
	}

}
