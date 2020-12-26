package code15_05;

public class Main {

	public static void main(String[] args) {
		boolean check;

		do {
			System.out.println("キャラクター名を入れてください");
			String x = new java.util.Scanner(System.in).nextLine();
			check = isValidPlayerName(x); //checkはtrueかfalse

			if(!check) {
				System.out.println("NGです"); //「!check」がtrueの時「NG」と出力。
			}
		}while(!check);
		System.out.println("OKです"); //「check」がtrueの時「!check」はfalseで、falseの時「OK」と出力。
	}


	public static boolean isValidPlayerName(String name){

		if(name.length() != 8) {
			return false;
		}

		char first = name.charAt(0);
		if(!(first>='A' && first<='Z')) { //頭文字はAからZ
			return false;
		}

		for(int i=1; i<8; i++) {
			char c = name.charAt(i);
			if(! ( (c>='A' && c<='Z') || (c>='0' && c<='9') )) {
				return false;
			}
		}

		return true;
	}

	public static boolean isValidplayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}


}
