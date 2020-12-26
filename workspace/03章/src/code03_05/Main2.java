package code03_05;

public class Main2 {

	public static void main(String[] args) {
// for 文による繰り返し

		for(int i= 0; i<10; i++) {
			//不等式0<= i <=10でもいいけど、、今後のため
			//4章でわかる
			//プログラミングでは0からスタートが基本だからと覚えとく。

			System.out.println("こんにちは");

			//こんにちは、が10個出てくるけど
			//それはi=0から9までの10個
			//つまり10個目のこんにちは、はi=9のときの
		}


		int count = 0;
		while(count<10) {
			System.out.println("こんにちは");
			count++;
		}
	}
}
