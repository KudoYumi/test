package code05_kitasoft2;
// 4-5
public class Main {

	public static void main(String[] args) {
		System.out.println("数字入力10回してください");
		int sum = 0;

		for(int i=0; i<10; i++) {
			int x = new java.util.Scanner(System.in).nextInt();
			sum += x;
		}
		double avg = sum/10;

		System.out.println("平均点は"+avg+"です");


// なんでavgはdouble型ですっていってるのに間違った計算結果なの？
// sum/10の時点で、13行目の右辺はint型整数で出てきちゃう
		//なぜなら右から評価するから。

	}

}
