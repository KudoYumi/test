package youtubeラムダの話7;

public class Test {
	public void process(Sample sample) {
		System.out.println("start"); //不変のコード

	//	Sample sample = Factory.create();
	//	sample.execute();  この2行が可変だとする。

		sample.execute();

		System.out.println("end"); //不変のコード
	}
	/* このprocessメソッドは関数型インターフェイスを引数で受け取り、
	 * 10行目にて、その関数型インターフェイスを実行してる。
	 */
}
