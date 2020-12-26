package code03_04;

public class Main2 {

	public static void main(String[] args) {
// switch文による分岐
		System.out.println("あなたの運勢占うよ");

		int fortune = new java.util.Random().nextInt(4)+1;
	/*	if(fortune == 1) {
			System.out.println("大吉");
		}else if(fortune == 2) {
			System.out.println("中吉");
		}else if (fortune == 3) {
			System.out.println("吉");
		}else if (fortune == 4) {
			System.out.println("凶");
		} */


		/* 条件式がすべて == 判定　であり、
		 * int以下の整数型、String、char型であるとき
		 　よりスマートなswitch型使える*/

		switch(fortune) {  //()の中は条件値！　条件式ではない。
		case 1:
			System.out.println("大吉");
			break;  //caseから	breakまでが上のif～sysoutのとこの略

		case 2:
			System.out.println("中吉");
			break;

		case 3:
			System.out.println("吉");
			break;

		default:
			System.out.println("凶");

			/*defaultの時もbreak書いてもいいけど、
			 最後の文で飛ぶ先わかってるからbreakいらない*/
		}
	}

}
