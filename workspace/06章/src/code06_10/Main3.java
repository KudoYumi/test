package code06_10;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int heights[] = {172,152,191,155,149};

		for(int i=0; i<heights.length-1; i++) {

			for(int j=0; j<heights.length-1; j++) {
				if(heights[j] > heights[j+1]) {
					int stack = heights[j]; // j番目の要素を保管
					heights[j] = heights[j+1]; // j+1の数値をj番目に代入
					heights[j+1] = stack; //  元々のj番目の値をj+1番目に代入
				}
			}
			/*11行目～17までのfor文のみだと
			  小さいほうを左にって作業だけになる。
			  全体を小さい順にしたいから　最初にfor i文を作った。*/
		}
		//9~21行目のfor文で11~17行目のループ作業をi=0~3まで繰り返し。


		for(int k:heights) {
			System.out.println(k);
		}


	}

}
