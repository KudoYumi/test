package code03_06;

public class MainEx2 {

	public static void main(String[] args) {
// 3-5
		System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");

		int selected;
		System.out.println("数字選べ"
				+ "");
		selected = new java.util.Scanner(System.in).nextInt();

		switch(selected) {
		 case 1:
			 System.out.println("検索します");
			 break;

		 case 2:
			 System.out.println("登録します");
			 break;

		 case 3:
			 System.out.println("削除します");
			 break;

		 case 4:
			 System.out.println("変更します");
			 break;
		}

	}

}
