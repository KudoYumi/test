package codeJanken;

//じゃんけんの別解(何度もあなたの勝ちですとかって書くのダルい)
public class Main2 {

	public static void main(String[] args) {
		System.out.println("選択してください 0.グー 1.チョキ 2.パー");

		int me = new java.util.Scanner(System.in).nextInt();
		int robot = new java.util.Random().nextInt(3);

		if(me == robot) {
			System.out.println("あいこです");

		} else { //(me != robot)省略
			if( (me==0 && robot==1) || (me==1 && robot==2) || (me==2 && robot==0) ){
				System.out.println("あなたの勝ちです");

			} else {
				System.out.println("あなたの負けです");
			}
		}


	}

}

/*以上のことからじゃんけんは、switchで書くより、
  if文で書いたほうがシンプル化も？？*/

