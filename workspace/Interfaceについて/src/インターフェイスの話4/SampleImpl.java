package インターフェイスの話4;

public class SampleImpl implements Sample{
	/* interfaceをimplementsしたクラスが
	 * interfaceの抽象メソッドの中身を提供しないといけない。
	 */

	@Override
	public void hoge() {
		System.out.println("hoge");
	}

}
