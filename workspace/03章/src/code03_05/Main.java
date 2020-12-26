package code03_05;

public class Main {

	public static void main(String[] args) {
//繰り返し構文のバリエーション
		//気温を入力
		System.out.println("気温入れて");
		double temp = new java.util.Scanner(System.in).nextDouble();

		while(temp>25) {
			temp--;
			System.out.println("温度一度下げました");

		System.out.println("温度は、"+temp+"です。");
		}




		System.out.println("気温入力");
		double kion = new java.util.Scanner(System.in).nextDouble();

		do {
			kion--;
			System.out.println("気温を一度下げた");
		} while(kion > 25);

		System.out.println("温度は、"+kion+"です。");

		/*do whileだと　実行してから評価だから
		 *28.5とかなら、24.5まで１ずつ下げてから評価だから、
		 *温度は24.5です、って出てくる*/
	}

}
