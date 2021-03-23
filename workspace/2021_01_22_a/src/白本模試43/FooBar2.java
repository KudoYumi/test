package 白本模試43;
//解決法2
//fooでcatchしてmainに例外発生したこと知らせない。

public class FooBar2 {
	public static void main(String[] args) {
		foo();
		System.out.println("完了");
	}
	private static void foo(){
		try{
			bar();
		}catch(Exception e) {
			System.out.println("catch");
		}
	}

	private static void bar() throws Exception{
		throw new Exception();
	}
}
