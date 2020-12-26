package code03_Kitasoft;
// 3-2

public class Main {

	public static void main(String[] args) {
		System.out.println("xに数値を入力");
		double x = new java.util.Scanner(System.in).nextDouble();

		System.out.println("yに数値を入力");
		double y = new java.util.Scanner(System.in).nextDouble();


		double m = Math.max(x, y);
		System.out.println("大きいほうは"+m);


		if(x>y) {
			System.out.println("大きいのは"+x);
		}else {
			System.out.println("大きいのは"+y);
		}
	}

}
