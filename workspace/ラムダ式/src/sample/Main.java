package sample;

public class Main {

	public static void main(String[] args) {
		Sample sam = new SampleImpl();
		sam.execute();
	}
	/* このままだとMainにて　実装した
	 * 実際に動くクラスSampleImplを使ってしまってる。
	 * そこで情報隠ぺいにのっとって
	 * Sampleを公開、SampleImplを非公開にする。
	 * → com.sampleパッケージにて
	 */

}
