package code_04_Kitasoft;
//4-4
public class Main4 {

	public static void main(String[] args) {
		// 7!

		// 方法１　インクリメント
		int x=1;

		for(int i=1; i<=7; i++) {
			x *= i;
		}
		System.out.println(x);

		// 方法２　デクリメント
		int y=1;

		for(int i=7; i>0; i--) {
			y *= i;
		}
		System.out.println(y);
	}

}
