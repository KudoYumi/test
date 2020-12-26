package zoho;

public class Main8_3 {

	public static void main(String[] args) {
		String name[] = {"山田","太田","鈴木","田中","高橋"};
		String gender[] = {"女","男","女","男","男"};
		String adr[] = {"東京","埼玉","東京","神奈川","埼玉"};

		System.out.println("住所入力");
		String x = new java.util.Scanner(System.in).nextLine();

		for(int i=0; i<name.length; i++) {
			if(x.equals(adr[i])) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}

			System.out.print(name[i]+"\t"+gender[i]+"\t "+adr[i]+"\n");
		}
	}

}
