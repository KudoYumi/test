package code02_04_a;

public class Main4 {

	public static void main(String[] args) {
//文字列の連結
		String msg = "私の年齢は" + 31 +"歳です";
		System.out.println(msg);
		//私の年齢は31歳ってやるには？
		//「私の年齢は"+31"歳";」だとエラーになる。
		//"歳です"の前に+を付けたらエラー解除され
		//たけど、これは法則でしたっけ？
		//→異なるオペランドの連結だから、+が必要。

		//Javaの連結は基本+で連結。

		System.out.println("私は"+10+"月生まれです。");
		//こーゆーのがString型とint型の連結。
		//"私は"や"月生まれです。"がString型、10はint型で、10がString型"10"に変換された。


		double a = 3;
		String b = "just"+a+"だったよ！";
		System.out.println(b);


	//復習項目
		System.out.println(85/172.0);
		System.out.println("私は"+85+"点だったよ。あなたは？" +83+"点だった～");

		System.out.println("私の身長は"+172.0+"cmです。");
		//文字列にとってはただの数字のためdouble型だろうとF型だろうと
		//文字列に変換されるってこと。

	}

}
