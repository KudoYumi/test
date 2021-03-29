package 例外処理とOverride1;

public class Test {
	public static void main(String[] args) {
		C c = new C();
		c.strToNum("a");
	//数字ではないのでNumberformat例外起きる
	//それをポリモ使ってRuntime非検査例外としてthrowsしてる
	//実際にthrowされるのはNumberformatExceptionなので
	//JVMによってそれが検出される。
	//これを例外処理を行い、
	//さらに正しくOverrideしたプログラムで記述→ver2

	}
}
