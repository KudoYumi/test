package zoho14_02_2;

class Game {
	int comNum;
	int myNum;

	public Game(int n) {
		comNum = new java.util.Random().nextInt(10);
		this.myNum = n;
		//フィールド値を設定
	}

	//インスタンスメソッド
	public void playGame() {

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
