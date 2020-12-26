package zoho;

public class Main10_2 {

	public static void main(String[] args) {
		String[] num = {"1305","0322","4732","8091","1124"};

		String incode = new java.util.Scanner(System.in).nextLine();

		int n;

		if(incode.equals("")) {
			System.err.println("未入力です。");

		}else { //未入力でないとき

			for(int i=0; i<num.length; i++) {
				if(incode.equals(num[i])) {

				}
			}
		}
	}

}
