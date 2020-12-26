package code02_06;

public class Main4 {

	public static void main(String[] args) {
//キーボードから１行の入力を受け取る命令
		System.out.print("あなたの名前を入力して下さい。");
		String name = new java.util.Scanner(System.in).nextLine();

		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();

		System.out.println("ようこそ、"+age+"歳の"+name+"さん");

		//(System.in)は標準入力キーボードからの入力のこと
		// nextLine()は文字列
		// nextInt()は整数として受け取る。



		System.out.println("以下の計算結果を答えよ。");
		double a = new java.util.Scanner(System.in).nextDouble();

		System.out.println("答えは、"+a+"でよろしいですか？");
	}

}
