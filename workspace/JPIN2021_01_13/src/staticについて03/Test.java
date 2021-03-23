package staticについて03;

// staticの注意点
public class Test {
	private int num;

	public static void execute() {
	//	System.out.println(num); まだインスタンス化してないからエラー
	//  System.out.println(this.num); static内ではthis.は使えない。


	// インスタンスを生成しないとnumにはアクセスできないから。
		System.out.println(new Test().num); //とすればいい。
		//メソッドの中でインスタンス生成した。
	}
}
