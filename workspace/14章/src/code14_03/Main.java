package code14_03;


public class Main {

	public static void main(String[] args) {
		String s = "こんにちは";
		Object o = s;
		printAnything(s);

		Hero h = new Hero();
		printAnything(h);
	}



	public static void printAnything(Object o) {
		//何型でもいいから、引数1個受け取り表示
		System.out.println(o.toString());

	}

}
