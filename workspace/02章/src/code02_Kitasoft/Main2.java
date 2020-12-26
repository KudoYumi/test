package code02_Kitasoft;
//2-5
public class Main2 {

	public static void main(String[] args) {

		int m = new java.util.Scanner(System.in).nextInt();
		int n = new java.util.Scanner(System.in).nextInt();

		System.out.println((m+n)/2);

		// m+nはint型、2もint型だから、(m+n)/2はint型つまり整数部分のみ出力
		// 正しい値を知りたいなら以下でやればよい。
		// または、10行目で　(m+n)/2.0 とすれば分母が2.0とdouble型なので
		// m+nの値がdouble型に変換されて、10行目の結果はdouble型で出てくれる。

		double sum = m+n;
		System.out.println(sum/2);

	}

}
