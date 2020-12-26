package code04_01;

public class Main3 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] scores = new int[5];
		System.out.println(scores[0]);



		int [] score2 = {20,30,40,50,80};
				System.out.println(score2[0]);
				System.out.println(score2[3]);




//練習
		int[] score3 = {20,30,40,50,80};

		int sum = score3[0] + score3[1] + score3[2] + score3[3] + score3[4];

		int avg = sum / score3.length;

		System.out.println("合計点"+sum);
		System.out.println("平均点"+avg);
	}

}
