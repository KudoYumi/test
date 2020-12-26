package code05_Kitakobo;
//5-2
public class Main2 {

	//配列使わないと大変そう

	public static void main(String[] args) {
		int value[] = new int[10];

		System.out.println("10個数値を入力してください");
		for(int i=0; i<10; i++) {
			value[i] = new java.util.Scanner(System.in).nextInt();
		}

	/* 拡張for文使いたなら、、、
	   拡張for文はそもそも要素の0番目から順番にしか表示できないから
	 * 一度入力した数値をすべて順番を入れ替える操作したうえで、
	 * その配列要素を0番目から順に表示、
	 * っていう方法でしか使えない。
	 *
	 * よって拡張for文はこの問題に向いてない。
	*/
		for(int i=9; i>=0; i--) {
			System.out.println(value[i]);
		}

	}

}
