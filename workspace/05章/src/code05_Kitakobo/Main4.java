package code05_Kitakobo;

public class Main4 {

	public static void main(String[] args) {
	/*合計が 100 を超えた場合、
	または入力が 10 回行われた場合、
	入力を止め入力された数値をすべて表示する。
	⇔　合計<=100 かつ 入力回数<10のとき、入力数値を表示*/

		int total=0;
		int count=0;

		System.out.println("数値を入力してください");

		while(total<=100 && count<10) {

			int x = new java.util.Scanner(System.in).nextInt();
			total += x;

			count++;

			System.out.print(x+ " ");
		}
	}

}
