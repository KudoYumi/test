package zoho14_02;

public class Main {

	public static void main(String[] args) {
		int n = new java.util.Random().nextInt(10);
		Game g = new Game(n);

		System.out.print("好きな数字を入力＞");
		int myNum = new java.util.Scanner(System.in).nextInt();

		do {
			g.playGame(myNum);

		}while(n!=myNum);

	}

}
