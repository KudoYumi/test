package code03_Kitasoft;
// 3-6
public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("数値入力");
		int m = new java.util.Scanner(System.in).nextInt();

		if(m>=0) {
			if(m%2 == 0) {
				System.out.println(m+"は正の偶数");
			}else {
				System.out.println(m+"は正の奇数");
			}

		}else {
			if(m%2 == 0) {
				System.out.println(m+"は負の偶数");
			}else {
				System.out.println(m+"は負の奇数");
			}
		}


	}

}
