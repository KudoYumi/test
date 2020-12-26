package code02_04_a;

public class Main {

	public static void main(String[] args) {
		//①前置インクリメント
		int a = 100;
		++a;
		System.out.println(a);

		//②後置インクリメント
		int x = 100;
		x++;
		System.out.println(x);
		// 単独なら、++aと　a++は同じだが、、、


		//※前置と後置では、ほかの演算式と一緒に使うとき意味が異なる。


		int A = 100;
		System.out.println(A++);
		System.out.println(A);
		// Sysoutのとこでは、++AとA++の意味は違ってくる。
		//理由は、(++A)なら評価される前に1足してるから、
		//(A++)なら、評価されてから1足してるから、画面に出てくる結果が違う。


		int b = 10;
		System.out.println(b++ +50);
		//これもb+50が先に行われてから、bに1加わるから　結果は60

		System.out.println(b);
		//そしてここでbを評価すると、前述で1加えられてるので11



	}

}
