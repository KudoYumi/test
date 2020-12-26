package zoho;

public class Main11 {

	public static void main(String[] args) {
		int sum = 0;
		int cnt = 0;

		do {
			System.out.print("[int]>>");
			int x = new java.util.Scanner(System.in).nextInt();

			System.out.println();

			if(x > 0) {
				sum += x;
				cnt++;
			}else {
				System.out.println("正ではないです");
			}

		}while(sum < 100);


		System.out.println("平均は"+sum/cnt);

	}

}
