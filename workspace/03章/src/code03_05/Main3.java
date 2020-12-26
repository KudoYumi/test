package code03_05;

public class Main3 {

	public static void main(String[] args) {
// ブロック外では利用不可

		for(int i=0; i<10; i++) {
			System.out.println("こんちは");
		}
		//ここまででブロック終わりだから次でまたi使っていい。

		for(int i=0; i<100; i++) {
		//のようにまたi使える。
		}


//無限ループ
		for(;;) {// ;だけは絶対省略したらダメ、エラー出る
			System.out.println("無限ループ");
		}

	}

}
