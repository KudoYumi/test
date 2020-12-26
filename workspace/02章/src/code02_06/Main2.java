package code02_06;

public class Main2 {

	public static void main(String[] args) {

// 文字列を数値に変換する命令

		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println(n);

		System.out.println("あなたは来年、" + (n+1) +"歳になる。" );


		String a = "0.1";
		double A = Double.parseDouble(a);
		//Dobleクラスのparseメソッドを使うって意味。

		System.out.println(10+ "の" + 0.01 + "倍は" + A +"です。");

		String b = "2.5";
		float B = Float.parseFloat(b);
		System.out.println(20 + "の" +B+ "倍は" +50+ "です。");

		String c = "100";
		long C = Long.parseLong(c);
		System.out.println("このクラスには"+C+"人います。");
	}

}
