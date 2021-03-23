package 例外05_2非検査の場合;

public class Test {
	public void execute(int value) {
		if(value<0) { //0未満はダメって設定
			throw new SampleException();
		}
		throw new NumberFormatException();
	}

	//throwできるのは1種類
}
