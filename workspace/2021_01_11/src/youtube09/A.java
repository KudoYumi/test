package youtube09;

public class A {

	public void hello() {
		B b = new B();
	//	b.hello(); ←ここで例外がthrowされてくるがtry-catchが必要

		try {
			b.hello();
		}catch(SampleException e) {
			e.printStackTrace();
		}
	/* これだとエラーは出ないが、
	 * 呼び出し元のmainメソッドにBで
	 * 例外発生したことが伝わらない。
	 *
	 * そこでmainに報告を投げるために
	 * Aクラスのhello()でもthrows宣言をする。→youtube09_2へ
	 */
	}
}
