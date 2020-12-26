package code02_Ex;

public class Main2 {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		String ans = "x+yは" + (x+y);
		System.out.println(ans +"です。");

		//2,4,5,


		System.out.println("ようこそ占いの館へ");

		System.out.println("あなたの名前を入力せよ");
		String name = new java.util.Scanner(System.in).nextLine();

		System.out.println("あなたの年齢を入力せよ");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		//省略していいなら、
		//int age = new java.util.Scanner(System.in).nextInt(); でもオッケー。

		int fortune = new java.util.Random().nextInt(4);
		fortune++;

		//省略していいなら、new java.util.Random().nextInt(4) +1; でもオッケー。

		System.out.println("占いの結果が出ました。");

		System.out.println(age+"歳の" +name+ "さんあなたの運気番号は" +fortune+"です。");

		System.out.println("1:大吉2:中吉3:吉4:凶");


		boolean result = new java.util.Random().nextBoolean();
		System.out.println(result);

		long s = new java.util.Random().nextLong();
		System.out.println(s);

//		int t = (int)new java.util.Random().nextLong();
		int t = (int)99999999L;
		System.out.println(t);







	}

}
