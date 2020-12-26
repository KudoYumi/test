package code04_10;

public class Main {

	public static void main(String[] args) {
// 点数管理プログラム(for使ってシンプルに！！)

		int[] scores = {20,30,40,50,80};
		int sum = 0; //合計点の初期条件

		for(int i=0; i<scores.length; i++) {
			sum += scores[i]; //i=0から4まで、1科目ずつsumに合算
		}

		int avg = sum / scores.length;

		System.out.println("合計点は"+sum);
		System.out.println("平均点は"+avg);
	}

}
