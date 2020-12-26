package code05_Kitakobo;
// 4-6
public class Main6 {

	public static void main(String[] args) {
		int wins = 0;


		for( int i = 0 ; i < 10 ; i++ ){
			System.out.println("勝ちなら1、負けなら0と入力");
		    int result = new java.util.Scanner(System.in).nextInt();

		    if( result == 1 ) //もし勝利なら
		        wins++;		  //勝利の回数を１増やします。
		}

		System.out.println("勝利は"+wins+"回、負けは"+(10-wins)+"回です");
		// else文でlosesの回数作るより、勝利回数だけわかれば負けの回数わかる問題だから。
	}

}
