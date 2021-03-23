package jpin1月6日分03;

public class Hoge {
	public static int num;

	public void hello() { //非staticメソッド
		System.out.println("hello");
	}

	public static void say() { //インスタンス生成せずとも動くメソッド
		System.out.println("say");
	}
}
