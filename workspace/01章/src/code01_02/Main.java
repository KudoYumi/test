package code01_02;

public class Main {

	public static void main(String[] args) {
		// 変数の宣言
		int age;

		// 変数へ値の代入
		age = 30;

		// これはオッケーだけどプログラムの質は悪い
		int Age;

		// 変数の中身を取り出して表示
		System.out.println(age);

		byte glasses;
		glasses = 127;
		System.out.println(glasses);

		short old;
		old = 31;
		System.out.println(old);

		int salary;
		salary = 12000000;
		System.out.println(salary);

		// longの場合は、数字の後にLつけるのが定義。
		long worldPeople;
		worldPeople = 6900000000L;
		System.out.println(worldPeople);


		// floatもFをつけないといけない。
		float weight;
		weight = 48.5F;
		System.out.println(weight);

		double height;
		height = 171.5;
		System.out.println(height);


		// 真偽値型
		boolean isError;
		isError = true;
		System.out.println(isError);

		boolean result;
		result = false;
		System.out.println(result);


		char zodiac;
		zodiac = '辰';//一文字しかダメ「辰年」とかはダメ;
		System.out.println(zodiac);

		String name;
		name = "工藤ゆみ";
		System.out.println(name);
		
		
		
		// ずっと箱の中身使いまわすならこのほうが便利
		int nennrei = 22;
		System.out.println(nennrei);


		
	}
}
