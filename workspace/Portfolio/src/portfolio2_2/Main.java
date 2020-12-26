package portfolio2_2;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero("ゆみ",1000,1000,250,10);

		Hero x1 = new Hero("はげ",4000,4000,100,20);

		//hのフィールドrealDamageを出力してみる
		System.out.println(h.getRD()); //←なんもしてないからデフォルト値０

		h.attack(x1);
	}

}
