package code05_Kitakobo;
//5-3
public class Main3 {

	public static void main(String[] args) {
		System.out.println("数値入力してください");

		int x[] = new int[10];

		for(int i=0; i<10; i++) {
			x[i] = new java.util.Scanner(System.in).nextInt();
		}

		System.out.print("\n偶数 :");
		for(int m:x) {
			if(m%2 == 0) {
				System.out.print(m +" ");
			}

		}

		System.out.print("\n奇数 :");
		for(int m:x) {
			if(m%2 != 0) {
				System.out.print(m +" ");
			}
		}

	}

}
