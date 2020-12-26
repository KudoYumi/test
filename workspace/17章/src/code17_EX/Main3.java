package code17_EX;
// 練習問題17-3

public class Main3 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");

		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました");
		}


	}

}
