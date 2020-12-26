package code03_Kitasoft;
// 3-5
public class Main5 {

	public static void main(String[] args) {
		System.out.println("数値入力");
		int n = new java.util.Scanner(System.in).nextInt();

		if(n%2 ==0) {
			System.out.println(n+"は偶数");
		}else {
			System.out.println(n+"は奇数");
		}
	}

}
