package code_04_Kitasoft;
// 4-6
public class Main6 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				for(int k=1; k<=4; k++) {
					if(i*j*k%2==0) {
						System.out.print("Hi ");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
