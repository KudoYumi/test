package 白本模試43;
//解決方法3
//mainでもthrowsしてしまう
public class FooBar3 {
	public static void main(String[] args) throws Exception{
		foo();
		System.out.println("完了");
	}
	private static void foo() throws Exception{
		bar();
	}

	private static void bar() throws Exception{
		throw new Exception();
	}
}
