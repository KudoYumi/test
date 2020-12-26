package code02_Ex;

public class Main4 {

	public static void main(String[] args) {
		// 復習

		String words = "税抜く価格入力して";
		System.out.println(words);

		int p = new java.util.Scanner(System.in).nextInt();

		String word = "税率入力して";
		System.out.println(word);

		double x = new java.util.Scanner(System.in).nextDouble();

		int m = (int)(p * x);
		System.out.println(m);

		System.out.println(p + m);

	}

}
