package text17_1;

public class Main {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());

		}catch(NullPointerException e) {
			System.out.println("nullpointer例外をcatch");
			System.out.println("スタックトレースここから");
			e.printStackTrace();
			System.out.println("ここまで");
		}
	}
}
