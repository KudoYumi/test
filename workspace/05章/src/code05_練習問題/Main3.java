package code05_練習問題;

public class Main3 {

	public static void main(String[] args) {
		String adress = "yahooPan56@gmail.com";
		String text = "こんちは～";
		String title = "無題";

		email(adress,text);
	//	email(title,adress,text);
	}


	public static void email(String adress,String text) {
		System.out.println( adress +"に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:"+text);
	}


	public static void email(String title,String adress,String text) {
		System.out.println(adress+ "に、以下のメールをしました");
		System.out.println("件名:" +title);
		System.out.println("本文:" +text);
	}

	//なぜに、16~18だけで、23~25のは出てこないの？
	// →10行目でemail(adress,text)しか呼び出されてないから。
	//23~25も表示させたいなら、11行目を追加しないといかん。

}
