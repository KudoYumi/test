package code05_06;

public class Main {

	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		add(x,y); //addメソッド呼び出し
	}


	public static void add(int x,int y) {
		int ans = x + y;
		System.out.print(x+ "+" +y+ "=" +ans); //xとyのスコープ(有効範囲)が8行目でおわってるからエラー
	}

}
