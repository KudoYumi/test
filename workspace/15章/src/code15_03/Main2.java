package code15_03;

// 練習課題
public class Main2 {

	public static void main(String[] args) {
		String s1 = "　　Java programming　 　";
		s1 = trim(s1);

	}


	public static String trim(String str) {
		String st = str;
		String st1 = st;
		boolean check;

		do { //必ず一度は処理するのでdo-while

			check = false;  //無限ループしないために最初にfalse指定

			st = st1;
			st1 = st.trim(); //半角スペース除去

			if(st1.startsWith("　")) { //先頭に全角スペースないか確認
				st = st1.substring(1); //全角スペースあったから先頭除去
				st1 = st;

				check = true; //全角スペースあったからもう一度チェック
			}


			//次に末端に全角スペースないか確認
			if(st1.endsWith("　")) {
				st = st1.substring(0, st1.length()-1); //全角スペースあったから末端のを除去
				st1 = st;

				check = true; //全角スペースあったので再度チェック
			}




		}while(check);

		return st1;

	}
}
