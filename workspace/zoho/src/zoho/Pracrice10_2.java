package zoho;

public class Pracrice10_2 {

	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;

		do {
			System.out.print("入力");
			int x = new java.util.Scanner(System.in).nextInt();

			if(x>0) {
				sum += x;
				cnt++;
				System.out.println();

			}else {
				System.out.println("正でない");
			}

		}while(sum<=100);

		System.out.println("平均は"+sum/cnt);
	}

}
