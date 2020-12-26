package code02_06;

public class Main {

	public static void main(String[] args) {

//代入命令実行
		double a = 0.99;
		double b = 0.8768;

		double R = Math.max(a, b);
		System.out.println(a+"と"+b+"とでは、大きいのは"+R+"です。");

		System.out.println(Math.min(3*5,8*3));


		double x = 3.0/9;
		double y = 5*0.0009;
		System.out.println(x +"と" + y + "とでは、");
		System.out.print("大きいのは" + Math.max(x, y));



	}

}
