package code03_06;

public class MainEx3 {

	public static void main(String[] args) {
// 3-6
		System.out.println("[数あてゲーム]");


		int ans = new java.util.Random().nextInt(2);

		for(int i=0; i<5; i++) {
			System.out.println("0~1の数字を入力して");
			int num = new java.util.Scanner(System.in).nextInt();

			if(ans == num) {
				System.out.println("あたり");
			}else {
				System.out.println("はずれ");
			}
		}

		System.out.println("ゲーム終了します");
	}

}
