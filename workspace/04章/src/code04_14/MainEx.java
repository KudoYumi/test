package code04_14;

public class MainEx {

	public static void main(String[] args) {
// 4-10を拡張for文でやってみる
		int[] scores = {20,30,40,50,80};
		int sum = 0;

		for(int value : scores) {
			sum += value;

		}

		int avg = sum / scores.length;

		System.out.println("合計点は"+sum);
		System.out.println("平均点は"+avg);
	}

}
