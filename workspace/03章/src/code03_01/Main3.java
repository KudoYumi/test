package code03_01;

public class Main3 {

	public static void main(String[] args) {
	//制御構文の構成要素の練習
		//もし雨降ってたら傘持ってく
		//そうでなければ持ってかない

		boolean tenkiAme = false;
		if(tenkiAme == true) {
			System.out.println("傘持っていく");
		} else {
			System.out.println("傘持っていかない");
		}


		boolean hare = true;
		if(hare == true)
			System.out.println("寄り道しよ");
		else
			System.out.println("しない");



		/* if(hare==true);
		としてしまうとelseにエラーでる。
		これはelseは　if条件があってはじめて定義されるから、
		「;」があると、晴れだったら作業終了します　って終わってしまてて
		elseが独り歩きしてるから。
		*/


	// かっこの省略

		boolean tennki = true;
		if(tennki = true) {
			System.out.println("洗濯をする");
			System.out.println("散歩する");
		} else
			System.out.println("DVDみる");
		    System.out.println("買い出しいかない");
	 //これだとelseのあとに{がないから　最後の「買い出しいかない」だけ独立



	}

}
