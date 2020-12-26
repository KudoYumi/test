package code02_Ex;

public class Main {

	public static void main(String[] args) {

		//
		System.out.println("年齢を入力してください。");
		String age1 = new java.util.Scanner(System.in).nextLine();

		//文字列→整数へ変換
		int age2 = Integer.parseInt(age1);

		age2++;
		System.out.println("来年は"+age2+ "歳です");

		System.out.println("税率を入力してください");
		double x = new java.util.Scanner(System.in).nextDouble();

		System.out.println("いくらの買い物しましたか？");
		int m = new java.util.Scanner(System.in).nextInt();


		System.out.println("合計金額は"+(int)(m*x)+"です。");


		System.out.println((int)m*x);
		//これが整数にならないのは、この式だと
		// (int)m  × x を意味するから。


	}

}
