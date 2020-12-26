package code06_10;
//自分で５つの要素の大小関係を評価してみよう！！
//北ソフトの練習問題5-8参照

public class Main2 {

	public static void main(String[] args) {

		int heights[] = {172,152,191,155,149};

		for(int i=0; (i+1)<heights.length; i++) {
			if(heights[i] > heights[i+1]) { //i番目の要素>i+1番目の要素のとき
				heights[i] = heights[i+1];
			}
			/* これだけだとi番目の要素がi+1番目の要素の数に塗り替えられただけ
			   0番目の要素が152になっただけだから、13行目の式だけだと
			   0番目の要素も　1番目の要素も152となってしまう。
			*
			*/

		}

		for(int h:heights) {
			System.out.println(h);
		}

	}

}
