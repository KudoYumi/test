package code03_05;

public class MainEx {

	public static void main(String[] args) {
// ・whileの練習
	/* ①数値入力
	 * ②数値が負の値だったら処理終わり。
	 * ③数値を合計
	 * ④①～③の繰り返しが終わったら合計値を表示する
	 */
		int input = 0;
		int total = 0;     //初期条件として最初0
		while(input>=0) {  //入力が0以上なら以下の作業の繰り返しします
			total += input;
			System.out.println("加算数値を入力して");
			input = new java.util.Scanner(System.in).nextInt();
		}
		System.out.println("合計値は"+total+"です");



	//別解　do whileでやると
		int total2 = 0;
		int input2;
		do {
			System.out.println("加算数値を入力");
			input2 = new java.util.Scanner(System.in).nextInt();
			if(input2>=0) {
				total2 += input2;
			}
		}while(input2 >= 0);
		System.out.println("合計値は"+total2+"です");
//	}



//・forの練習
	/* ①数値入力
	 * ②入力された回数分"こんばんわ"と表示
	 * */
		System.out.println("こんばんはの繰り返し回数を入力");
		int count = new java.util.Scanner(System.in).nextInt();

		for(int i=0; i<count; i++) {
			System.out.println("こんばんわ");
		}

	//(別解)
		for(int i=0; 1<=i && i<=7; i+=1) { //絶対三つのパーツからなるように;;忘れたらだめ
			System.out.println("こんばん");
		}

	}

}
