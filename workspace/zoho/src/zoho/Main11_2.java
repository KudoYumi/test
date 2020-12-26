package zoho;

public class Main11_2 {

	public static void main(String[] args) {

		String benderName[] = {"NEC","富士通","パナソニック","東芝","SHARP","VAIO"};
		String telNum[] = {"111","222","333","444","555","666"};


		System.out.print("機種名入力＞＞");
		String pcName = new java.util.Scanner(System.in).nextLine();

		switch(pcName) {
			case "PC-9801":
			case "VALUESTAR":
			case "Lavie":
				System.out.println("PC機種名"+pcName);
				System.out.println("ベンダー名:"+"\t"+benderName[0]);
				System.out.println("TEL番号"+telNum[0]);
			break;


			case "FM-V":
				System.out.println("PC機種名"+pcName);
				System.out.println("ベンダー名:"+"\t"+benderName[1]);
				System.out.println("TEL番号"+telNum[1]);
			break;


			case "Let's note":
				System.out.println("PC機種名"+pcName);
				System.out.println("ベンダー名:"+"\t"+benderName[2]);
				System.out.println("TEL番号"+telNum[2]);
			break;


			case "Dynabook":
				System.out.println("PC機種名"+pcName);
				System.out.println("ベンダー名:"+"\t"+benderName[3]);
				System.out.println("TEL番号"+telNum[3]);
			break;


			case "Mebius":
			case "Mebius note":
				System.out.println("PC機種名"+pcName);
				System.out.println("ベンダー名:"+"\t"+benderName[4]);
				System.out.println("TEL番号"+telNum[4]);
			break;


			case "VAIO":
			case "VAIO note":
				System.out.println("PC機種名"+pcName);
				System.out.println("ベンダー名:"+"\t"+benderName[5]);
				System.out.println("TEL番号"+telNum[5]);
			break;


			default:
				System.out.println("PC機種名"+pcName);
				System.err.println("ベンダー名:"+"\t登録されていません。");
				System.err.println("TEL番号"+"\t登録されていません。");
		}
	}

}
