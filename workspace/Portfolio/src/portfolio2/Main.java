package portfolio2;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("ゆみ",1000,1000,250,10);

		Hero x1 = new Hero("はげ",4000,4000,100,20);

		h.attack(x1); //なんで0？ portfolio1のactualDamage初期化されたまま、の理由と同じ。
	}

}
