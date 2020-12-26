package code03_03;

public class Main3 {

	public static void main(String[] args) {
	// 練習問題

		System.out.println("xに値を入れて");
		int x = new java.util.Scanner(System.in).nextInt();

		//入力された値は負の値か
		while(x < 0) {
		//負であれば繰り返し作業実行
		//ここから繰り返し
		//Scannerで数値入力
			System.out.println("数値入力して");
			x = new java.util.Scanner(System.in).nextInt();

		}

		//繰り返し終了
		//終了と表示する
		System.out.println("終了");
	}

}
