package zoho_1;

import java.util.Scanner;
public class Zoho12_3 {
	static String[] name = {"山田","鈴木","佐々木","田中","小林"};
	static String[] gender = {"男性","女性","男性","女性","男性"};
	static int[] age = {20,37,45,31,52};
	static String[] addr = {"東京","神奈川","東京","埼玉","埼玉"};

	public static void main(String[] args) {
		System.out.print("検索したい住所＞");
		String searchAdr = new Scanner(System.in).nextLine();
		String seachGender;

		if(searchAdr.equals("")) {
			view();
		}else { //検索住所を空白にしてないとき
			System.out.print("検索したい性別＞");
			seachGender = new Scanner(System.in).nextLine();

			if(seachGender.equals("")) {
				view(searchAdr);
			}else {
				view(searchAdr,seachGender);
			}
		}



	}

	public static void view() {
		for(int i=0; i<name.length; i++) {
				System.out.println
					((i+1)+"\t"+name[i]+"\t"+gender[i]+"\t"+age[i]+"\t"+addr[i]);
		}
	}


	public static void view(String adress) {
		for(int i=0; i<name.length; i++) {
			if(adress.equals(addr[i])) {
				System.out.println
					((i+1)+"\t"+name[i]+"\t"+gender[i]+"\t"+age[i]+"\t"+addr[i]);
			}
		}
	}


	public static void view(String adress,String Gender) {
		for(int i=0; i<name.length; i++) {
			if((adress.equals(addr[i])) && (Gender.equals(gender[i]))){
				System.out.println
					((i+1)+"\t"+name[i]+"\t"+gender[i]+"\t"+age[i]+"\t"+addr[i]);
			}
		}
	}
}
