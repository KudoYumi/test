package code05_練習問題;

public class Main2 {

	public static void main(String[] args) {
		String title = "こんちは～";
		String address = "yahooPan56@gmail.com";
		String text = "どもども工藤です。";

		email(title,address,text);
	}


	public static void email(String title,String adress,String text) {
		System.out.println(adress + "に、以下のメールを送信しました。");

		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}

}
