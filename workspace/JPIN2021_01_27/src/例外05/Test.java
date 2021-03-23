package 例外05;

public class Test {
	public void execute(int value) throws SampleException,NumberFormatException{
		if(value<0) { //0未満はダメって設定
			SampleException ex = new SampleException();
			throw ex;
		// 1行で throw new Sample Exception()としてもいい。
		}
		throw new NumberFormatException();
	}

	//throwできるのは1種類
}
