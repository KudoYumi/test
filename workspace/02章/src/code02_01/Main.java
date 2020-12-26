package code02_01;

public class Main {

	public static void main(String[] args) {
		// 変数宣言の文
		int a;
		int b;

		//計算の文
		a = 20;
		b = a + 5; //足し算をして代入

		//命令文
		System.out.println(a);
		System.out.println(b);
		System.out.println(a*b);
		System.out.println(a/b); //なぜ少数にならない！？doubleとか使ってないから？でもSystem outの作業だけど汗
		// 少数で答え出すには、20.0÷25.0のようにしないといけなくて、intじゃなくdouble使わないといけない。


		double numberC; numberC = a/b;
		System.out.println(numberC); // これは商しか結果出てこない。

		double c = 20.000;
		double d = a + 5.000;

		System.out.println(c/d);

	}

}
