package code05_10;

//　オーバーロード
public class Main {

	public static int add(int x, int y) {
		return x + y;
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static String add(String x, String y) {
		return x + y;
	}


	public static void main(String[] args) {
		System.out.println(add(10.0,20.3));

		System.out.println(add(3,2));
		//6行目のintメソッドなくてもint型はdoubleに変換できるので上にdoubleあるからint型でもオッケー

		System.out.println(add("Hello", "World"));
	}
		//勝手に上の対応する型に代入してくれる

}
