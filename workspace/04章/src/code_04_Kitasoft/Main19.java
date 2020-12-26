package code_04_Kitasoft;
// 4-19
public class Main19 {

	public static void main(String[] args) {
		System.out.println("xに数値入力");

		int x;
		int sum = 0;
		int count = 0;

		do {
			x = new java.util.Scanner(System.in).nextInt();
			sum += x;
			count++;
		}while(x!=0);

		System.out.println(sum/count);

	}

}
