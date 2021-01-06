package zoho_1;
import java.util.Scanner;

public class Zoho11_3 {
	public static void main(String[] args) {
		String[] code	= {"d001","d002","d003","d004","d005"};
		String[] name 	= {"お茶","麦茶","烏龍茶","抹茶","紅茶"};
		int[] price	= {100,110,100,150,120};

		System.out.print("商品コード入力＞");
		String in_code = new Scanner(System.in).nextLine();
		int flg=0;

		for(int i=0; i<code.length; i++) {
			if(in_code.equals("")) {
				if(!(in_code.equals(code[i]))) {
					flg=1;  //1の時は赤字で存在しないと表示
				}
			}
		}

		if(flg==1) {
			System.err.println("商品コードありません");
		}
		System.out.print("購入希望数＞");
		int num = new Scanner(System.in).nextInt();
	}
}
