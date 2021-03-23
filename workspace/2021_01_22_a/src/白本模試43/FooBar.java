package 白本模試43;
//解決方法1
//伝搬させてmainで受け取る

public class FooBar {
	public static void main(String[] args) {
		try{
			foo();
		}catch(Exception e) {
			System.out.println("catch");
		}
	}
	private static void foo() throws Exception{
		bar();
	}

	private static void bar() throws Exception{
		throw new Exception();
	}
}
