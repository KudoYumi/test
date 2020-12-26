package code06_Zoho;

public class Main2 {

	public static void main(String[] args) {
		String id[] = {"1305","0322","4732","8091","1124"};

		System.out.println("数値入力");
		String x = new java.util.Scanner(System.in).nextLine();

		for(int i=0; i<id.length; i++) {
			if(x.equals(id[i])) {
				System.out.println("承認しました");
			}
		}
	}

}
