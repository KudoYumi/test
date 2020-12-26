package code_04_Kitasoft;
//4-10
public class Main10 {

	public static void main(String[] args) {
		System.out.println("数値入力して");
		int n = new java.util.Scanner(System.in).nextInt();


		for(int i=0; i<n; i++) {
			System.out.print("* ");
		}

		System.out.println();

		//while文でもできるようにせよ
		while(n>=1) {
			System.out.print("* ");
			n--;
		}
	}

}
