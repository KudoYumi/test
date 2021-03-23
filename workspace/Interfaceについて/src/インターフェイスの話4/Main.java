package インターフェイスの話4;

public class Main {
	public static void main(String[] args) {
		Sample sample = new SampleImpl();
		sample.hoge();


	//	Sample.NUM = 20;
	//  interfaceのフィールドは定数だからこれ書き換えようとしてるからエラー
	}
}
