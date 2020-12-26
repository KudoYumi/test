package codeJanken;
// 3人でじゃんけん

public class Main3 {

	public static void main(String[] args) {
		System.out.println("選択してください 0.グー 1.チョキ 2.パー");

		int me = new java.util.Scanner(System.in).nextInt();
		int robotA = new java.util.Random().nextInt(3);
		int robotB = new java.util.Random().nextInt(3);

		if( (me==robotA && robotA==robotB) || //3通り
			(me!=robotA && robotA!=robotB) ){ //6通り
			System.out.println("あいこです");


		} else if(me!=robotA && robotA==robotB) {
			//あいこでもなく、AとBは同じ手を出し、meだけ違う手のとき
			if(
				(me==0 && robotA==1) || (me==1 && robotA==2) || (me==2 && robotA==0)
				){
				System.out.println("あなたの一人勝ちです");

			} else { //3通りある
				System.out.println("あなたの一人負けです");
			}

		} else { /*あいこでもないし、AとB同じ手でもない。
		 		つまり、meともうひとりが同じ手で、残り一人が違う手*/
			if(
				( (me==0 && robotA==1) || (me==0 && robotB==1) ) ||
			    ( (me==1 && robotA==2) || (me==1 && robotB==2) ) ||
			    ( (me==2 && robotA==0) || (me==2 && robotB==0) )
			   ) {
				System.out.println("あなたともうひとり勝ちです");
			} else { //6通り
				System.out.println("あなたともう一人負けです");
			}

		}

	}

}


/*全部で3*3*3=27通りの手の出し方。
 * あいこは、三人とも一緒の手(3通り)か、すべて異なるとき(6通り)なので９通り。
 *meが勝つには、me一人勝ちか、ほかの一人と一緒に勝つかのいずれか。
 *一人勝ちは3通り。　他のだれかと勝つのは、6通り。
 *勝てばいいだけなら、上の9通り。つまり確率的には1/3。
 */

