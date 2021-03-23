package 黒本9;

public class Main {
	public static void main(String[] args) {
		String str = "hoge, world";
		str = hello(str);
		System.out.println(str); //hello, world
	}

	private static String hello(String msg) {
		return msg.replace("hoge","hello");
	}
}
