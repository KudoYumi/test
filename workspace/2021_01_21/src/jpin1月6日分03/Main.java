package jpin1月6日分03;

public class Main {
	public static void main(String[] args) {

		Hoge hoge = new Hoge();
		hoge.hello();

		Hoge.say();

	/* hoge.say()としてもいいのは
	 * コンパイラーが勝手にこれをHoge.say()に変換してるから。
	 */
		Hoge.num = 10; //Hogeのstaticフィールドに10代入
		System.out.println(Hoge.num
				
				);
	}
}
