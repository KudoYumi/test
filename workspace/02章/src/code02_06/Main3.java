package code02_06;

public class Main3 {

	public static void main(String[] args) {
// 乱数を生み出して代入する命令

		int n = new java.util.Random().nextInt(90);
		System.out.println("あなたの年齢は多分、" + n + "歳ですよね？");


		int a = new java.util.Random().nextInt(6) +1;
		//new java.util.Random().nextInt(6)だけだと、0から5までになっちゃう。
		//　だから　+1をする。

		System.out.println("出たサイコロの目は" + a + "です。");


		double b = new java.util.Random().nextDouble();
		System.out.println(b);
		//0以上1未満の実数が出てくる。


	//メモ) 数値以外にも、nextBoolean()もある。
	//(参考)数値の乱数を発生させるだけなら、Math.random()も使える。


	// double r = Math.random() ←0以上1未満の実数を返す。

	//(例)int dice = (int)(Math.random() *6) +1;など

		int dice = (int)(Math.random()*6) +1;

		//(int)(Math.random()*6)で 0から5までの整数を表すから。

		System.out.println(dice);
		//この方法でサイコロの出る目の乱数を調べてもいい。

	}

}
