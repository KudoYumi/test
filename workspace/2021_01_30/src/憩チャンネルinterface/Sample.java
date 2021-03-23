package 憩チャンネルinterface;

public class Sample implements IF{
	public static void main(String[] args) {
		IF.test();
	//interfaceのstaticメソッドは必ずこう呼ばないといけない。
	//test()だけだとエラー。


		new Sample().exe(); //IFのdefaultメソッド呼び出し
	// さらにIFのdefaultメソッドをオーバーライド可能。
	}
}
