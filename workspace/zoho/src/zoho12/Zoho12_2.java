package zoho12;

public class Zoho12_2 {

	public static void main(String[] args) {

		System.out.print("検索したい住所は？");




	}

	public static void view() {
		String[] names = {"山田","鈴木","佐々木","田中","小林"};
		int[] age = {20,37,45,31,52};
		String[] adr = {"東京","神奈川","東京","埼玉","埼玉"};

		String input = new java.util.Scanner(System.in).nextLine();


		for(int i=0; i<names.length; i++) {
			if(input.equals(adr[i])) {
				System.out.println((i+1)+"\t"+names[i]+"\t"+age[i]+"\t"+adr[i]);
			}else if(input.equals("")){
				System.out.println((i+1)+"\t"+names[i]+"\t"+age[i]+"\t"+adr[i]);
			}
		}


	}

}
