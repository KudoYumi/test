package innerClassUse;

import innerClass.Factory;
import innerClass.Imple2;
import innerClass.SampleInter;

public class Main {
	public static void main(String[] args) {
		SampleInter inter = Factory.create();
	// 右辺はSampleImplのインスタンス、それをinterに代入

	/* SampleInter inter2 = Factory.getInner();
	 * これはFactoryクラス内のInnerクラスが
	 * implementsしてないからエラー。
	 */
//	SampleInter inter2 = new Imple2().new Inner2();→エラー:implementsしてない

		SampleInter inter3 = new Imple2().new Inner3();

	/* 結果を見ると、
	 * インナークラスのインスタンスを
	 * 多態性使ってインターフェイスとして見なせるためには、
	 * インナークラスの所属する外部クラスが
	 * インターフェイスを実装していて、かつ
	 * インナークラスも実装していないといけない。と分かった。
	 *
	 * ただ単にクラスがインターフェイスを実装してるからと言って、
	 * その内部クラスまでもが、
	 * インターフェイスを実装してる関係性ではないと分かった。
	 */

	}
}
