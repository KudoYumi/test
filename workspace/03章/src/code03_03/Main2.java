package code03_03;

public class Main2 {

	public static void main(String[] args) {
// 論理演算条件式
		System.out.println("年齢入れて");
		int age = new java.util.Scanner(System.in).nextInt();

		System.out.println("誕生日月入れて");
		int month = new java.util.Scanner(System.in).nextInt();

		if(age >= 18 || month == 5) {
			System.out.println("18歳以上または5月生まれです");
		}else {
			System.out.println("18歳以上でもないし、５月生まれでもないです");
		}


		if(!(age>=20));
	}


}
