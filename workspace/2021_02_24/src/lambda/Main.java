package lambda;

public class Main {
	public static void main(String[] args) {
		Func f = new Func() {
					// 実装匿名クラス
					public void show(String name) {
						System.out.println("hello"+name);
					}
				};
		f.show("ゆみ");

		//ラムダ式でシンプルに
		Func f2 = System.out::println;
		f2.show("パンダ");
	}
}
