package zoho12;

public class Zoho12_3 {

	public static void main(String[] args) {

		System.out.print("検索したい住所入力＞");
		String input_adr = new java.util.Scanner(System.in).nextLine();

		//引数なし、住所を引数とするもの、住所と性別を引数とするものを定義


		if(input_adr.equals("")) {
			view();
		}else {
			System.out.print("性別入力＞");
			String input_gender = new java.util.Scanner(System.in).nextLine();

			if(input_gender.equals("")) { //住所未入力でないとき
				view(input_adr);
			}else {
				view(input_adr,input_gender);
			}
		}
	}

	//住所未入力の時
	public static void view() {
		String[] names = {"山田","鈴木","佐々木","田中","小林"};
		String[] gender = {"男","女","男","男","女"};
		int[] age = {20,37,45,31,52};
		String[] adr = {"東京","神奈川","東京","埼玉","埼玉"};

		for(int i=0; i<names.length; i++) {
			System.out.println
			((i+1)+"\t"+names[i]+"\t"+gender[i]+"\t"+age[i]+"\t"+adr[i]);
		}
	}

	//性別未入力の時
	public static void view(String input_adr) {
		String[] names = {"山田","鈴木","佐々木","田中","小林"};
		String[] gender = {"男","女","男","男","女"};
		int[] age = {20,37,45,31,52};
		String[] adr = {"東京","神奈川","東京","埼玉","埼玉"};

		for(int i=0; i<names.length; i++) {
			if(adr[i].equals(input_adr)) {
				System.out.println
				((i+1)+"\t"+names[i]+"\t"+gender[i]+"\t"+age[i]+"\t"+adr[i]);
			}
		}
	}

	//どちらも入力したとき
	public static void view(String input_adr,String input_gender) {
		String[] names = {"山田","鈴木","佐々木","田中","小林"};
		String[] gender = {"男","女","男","男","女"};
		int[] age = {20,37,45,31,52};
		String[] adr = {"東京","神奈川","東京","埼玉","埼玉"};

		for(int i=0; i<names.length; i++) {
			if( (adr[i].equals(input_adr)) && (gender[i].equals(input_gender)) ){
				System.out.println
				((i+1)+"\t"+names[i]+"\t"+gender[i]+"\t"+age[i]+"\t"+adr[i]);
			}
		}
	}

}
