package インターフェイスの話5;

public class SampleImpl implements Sample,Test{

	@Override
	public void hoge() {
		System.out.println("hoge");
	}

	@Override
	public void execute() {
		System.out.println("execute");
	}
	// executeを実装してないとコンパイルエラー

}
