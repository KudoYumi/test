package code05_05;

// 複数の引数を渡す場合
public class Main {

	public static void main(String[] args) {
		add(100, 20);
		add(200, 50);
	}


	public static void add(double x, int y) { //←あえてdouble型にしてみた
		double ans = x + y;
		System.out.println(x+ "+" +y+ "=" +ans);
	}
}
