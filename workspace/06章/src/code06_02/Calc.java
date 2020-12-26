package code06_02;
// 計算プログラム

public class Calc {

	public static void main(String[] args) {

		int a=10;  int b=2;
		int total = CalcLogic.tasu(a,b);
		int delta = CalcLogic.hiku(a,b);
		/* Calcクラスにtasu()メソッドや、hiku()メソッドないから
		「CalcLogic.」がないとエラー。*/

		System.out.println("足すと" +total+ "引くと" +delta);
	}


}
