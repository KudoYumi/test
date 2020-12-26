package code01_Excise001;

public class Main {

	public static void main(String[] args) {
		int a = 3;  		// 変数aに3を代入
		int b = 5;  		// 変数bに5を代入
		int c = a * b;		// 変数cにa×bを代入

		System.out.println("縦幅"+a+"横幅"+b+"の長方形の面積は、"+c+"または"+a*b);




	boolean isError = true;

	char kanji = '駆';

	double PI = 3.14;

	long number = 314159265853979L;  //問題文にLがあるってことはlong指定

	String words = ("ナトの攻撃！敵に"+a*b+"ダメージ与えた");

	System.out.println(isError + "は、ホント");
	System.out.println("かけるを漢字で書くと、" + kanji + "となり");
	System.out.println(PI + "は正確には" + number + "と書ける");
	System.out.println("最終的には、" + words);




	}

}
