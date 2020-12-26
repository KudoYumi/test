package zoho14_02_2;

public class Main {

	public static void main(String[] args) {
		int n;
		Game g;

		do {
			System.out.print("好きな数字入力>");
			n = new java.util.Scanner(System.in).nextInt();
			g = new Game(n); //コンストラクタ作動

			g.playGame();


		}while(g.myNum!=g.comNum);
	}

}
