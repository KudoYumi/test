package code06_Zoho;

public class Main1 {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();

		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(j==i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
		}

	}

}
