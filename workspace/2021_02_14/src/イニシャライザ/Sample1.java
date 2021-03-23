package イニシャライザ;

public class Sample1 {
	int num = 10;
	static String id;

	{ System.out.println("インスタンスイニシャライザ1");
	  num += 10; }

	{ System.out.println("インスタンスイニシャライザ2");
	  id = "ゆみ"; //Sample1.idのこと
	}



	static {
		System.out.println("staticイニシャライザ起動");
		id = "AAA";
	}

	public static void main(String[] args) {
		System.out.println(Sample1.id); //AAA
		System.out.println(new Sample1().num);
	// 「インスタンス1」出力 num→20に
	// 「インスタンス2」出力 id → ゆみ
	//  20が出力
		System.out.println(Sample1.id); //ゆみ

		System.out.println("新規インスタンス生成");
		Sample1 s = new Sample1();

	/* staticイニシャライザの処理は、
	 * クラスファイルをロードするタイミングで
	 * 一度だけ実行される。
	 *
	 * 対してインスタンスイニシャライザは
	 * インスタンスを生成するときに毎回実行される。
	 * これはnewされるたびに
	 * 非staticな部分のクラス定義がヒープにコピーとられる
	 * ことを考えたら当たり前なことである。
	 */
		Sample1 s2 = new Sample1();

	}
}
