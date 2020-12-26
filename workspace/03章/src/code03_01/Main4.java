package code03_01;

public class Main4 {

	public static void main(String[] args) {
		//
		boolean tenki = true;
		int temp ;
		if (tenki = true) {
			temp = 25;  // int tempと上で宣言してるからただ「temp=25」なら大丈夫
			System.out.println("散歩する");
			System.out.println("干す");

		} else {
	//		int temp = 18;  //tempが上と重複してるけどifのブロックと別だから大丈夫
			System.out.println("うちにいる");
			System.out.println("DVD");
		}

			//System.out.println("気温は"+temp+"です");
			//これはtempのスコープ範囲外だからエラー出る。
	}

}
