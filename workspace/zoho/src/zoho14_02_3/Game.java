package zoho14_02_3;

class Game {
	int comNum;
	int myNum;

	public Game() {

	}

	//インスタンスメソッド
	public void playGame() {
		System.out.println("数値入力");
		comNum = new java.util.Random().nextInt(10);
		myNum = new java.util.Scanner(System.in).nextInt();

		System.out.println("\nあなた："+myNum);
		System.out.println("コンピュータ："+comNum);

		if(myNum==comNum) {
			System.out.println("当たり");
		}else {
			System.out.println("はずれ");
		}
	}

	//getter setterは省略
}
