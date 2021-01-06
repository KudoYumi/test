package reflection2;

public class Main {
	public static void main(String[] args) throws Exception{
		Sample sample = new Sample();
		sample.test(new Item(100,"apple"));

	/* SampleにはItemのインスタンスへの参照が渡されているが
	 * 渡されてきてるSample側には、
	 * 何のクラスのインスタンスへの参照が渡されたのかわからない、
	 * て状態になってる。
	 *
	 * 何型が渡されたのかわからないけど、
	 * そのクラスのメタ情報を取り出すことで、
	 * メタ情報から、名前を取り出したり、
	 * フィールド情報を取り出したり、
	 * さらには実行処理もできる。
	 */
	}
}
