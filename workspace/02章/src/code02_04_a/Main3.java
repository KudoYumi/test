package code02_04_a;

public class Main3 {

	public static void main(String[] args) {
		// データより小さな型に代入
		//int i = 3.2;  //小数点以下の値はどう処理？

		//整数リテラル：int型→末尾にLをつけるとlong型

		//実数リテラル：double型→末尾にFつけるとfloat型

//強制的型変換　キャスト演算子
		int age = (int)3.2;
		System.out.println(age);
		//無理やり型変換したため少数点以下の情報失った。
		//特別な理由を除いて、この方法は使わない。
		//小数点以下の情報失ってもいいならオッケー。
		//数値型に限定される。trueやfalseは数値でないから絶対ダメ。

	//int x = a; // 3.0≠3だからエラー キャストするなりしないとダメ
	//練習例題
		double a = 3.0;
		int b = (int)a;
		System.out.println(b);


		short x = (short)3939.3939F;
		System.out.println(x);

		int y = (int)100.58585858585;
		System.out.println(y);




//演算時の自動変換
		System.out.println(5.0/2);
		//このように大きい方の型に合わせて計算される。
	//練習例題
		long l = 5 + 2L;
		System.out.println(l);

		System.out.println(5.0F + 2L);  //float型の7.0
		System.out.println(5.0 + 2L);   //double型の7.0

		System.out.println(3L * 10.0F);
		System.out.println(9.0/3.0F);



		//豆知識
		char c = (char)3.2;
		System.out.println(c);

		int i2 = (int)'A';
		System.out.println(i2);  //10進数で表示される。




	}

}
