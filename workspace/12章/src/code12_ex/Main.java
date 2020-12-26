package code12_ex;

public class Main {

	public static void main(String[] args) {
		Y array[] = new Y[2]; //A,Bの二つのクラスを生成

		array[0] = new Alpha(); // その0番目にAlphaを新規生成
		array[1] = new Beta();  // 1番目にBetaを新規生成

		for(Y i:array) { //arrayの中身を順に表示
			i.b();
		}


		for(int j=0; j<array.length; j++) {
			array[j].a();
		}

		if(array[1] instanceof Beta ) {
			Beta b = (Beta)array[1];
			b.c();
		}
		/* Beta.c()はエラー。
		 * ここのクラスにc()ない。
		 * いったんこのようにキャストしてBetaクラス型にしたりすれば大丈夫
		 */


	/*	array[1].c(); 箱Yでそもそもcメソッド存在しない。
	 *  存在すれば、Betaクラスでオーバーライドされたc()の内容が表示される。*/


	/* Y.a();とかってするのもダメ！
	 * なぜならYはabstract宣言しているため、newインスタンス化できない。
	 * 箱の型としてしかこの場合使えないから。
	 * Y.a() てするにはまずnew Yを作らないといけない。
	 * Yは今、abstractしてるから、newできない。
	 * だからY.a()てやるとエラー。
	 */


//	for(Y i=0; i<array.length; i++) {}  「Y i」のとこがミス！
		/* スタートのi=0のとこは0番目～の意味だからint i=0 */
	}

}
