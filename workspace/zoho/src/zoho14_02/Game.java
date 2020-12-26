package zoho14_02;

public class Game {
	int number;

	Game(int number){
		this.number = number;
	}

	public void playGame(int n) { //自分で入力した数字を引数で受け取る
		System.out.println("あなたの数字＞"+n+"\n");
		System.out.println("コンピュータの数字＞"+number);

		if(n==number) {
			System.out.println("あたり");
		}else {
			System.out.println("はずれ");
		}
	}
}
