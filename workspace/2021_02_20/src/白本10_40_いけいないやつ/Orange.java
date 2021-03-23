package 白本10_40_いけいないやつ;

public class Orange extends Fruit{
	@Override
	void foo() throws RuntimeException{ //サブで例外投げてる
		System.out.println("Orangefoo");
		throw new RuntimeException();
	}
	//非検査例外ゆえにエラー出てない
	//でも使う側が混乱する
}
