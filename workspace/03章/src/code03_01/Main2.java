package code03_01;

public class Main2 {

	public static void main(String[] args) {
	//繰り返し
		boolean doorClose = true; //falseはなんもしない
		while(doorClose == false) {   //trueの場合、{}内の行動を繰り返す
			System.out.println("ノックする");
			System.out.println("待つ");
		}
		System.out.println("処理終了");
		//whileのブロックが条件不成立のとき{}の行動をすっ飛ばして　処理終了と出す。
		//この12行目ないとなんも表示されないので。

		// whileはelseない。whileは繰り返すだけで不成立なら次行くだけ。
	}

}
