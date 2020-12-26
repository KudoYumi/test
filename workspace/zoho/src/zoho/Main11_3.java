package zoho;

public class Main11_3 {

	public static void main(String[] args) {

		String code[] = {"d001","d002","d003","d004","d005"};
		String name[] = {"お茶","麦茶","ウーロン茶","抹茶","紅茶"};
		int price[] = {100,110,100,150,120};

		int sum = 0;
		String inCode;



		do {
			System.out.print("[購入希望の商品コードを入力して下さい(Enterで終了)]>");
			inCode = new java.util.Scanner(System.in).nextLine();
			System.out.println(); //改行

			System.out.print("[購入希望数を入力して下さい]>");
			int n = new java.util.Scanner(System.in).nextInt();

			for(int i=0; i<code.length; i++) {
				if(inCode.equals(code[i])) {
					System.out.println("商品名"+name[i]);
					System.out.println("購入数"+n+"個");

					int toPrice = price[i]*n;
					System.out.println("購入金額"+toPrice);

					sum += toPrice;
					System.out.println("合計購入額"+sum);
				}
			}

		//	if()
		}while(inCode.equals(""));

	}


}
