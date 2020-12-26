package zoho;

public class Main11_2_2 {

	public static void main(String[] args) {
		String benderName[] = {"NEC","富士通","パナソニック","東芝","SHARP","VAIO"};
		String telNum[] = {"111","222","333","444","555","666"};


		System.out.print("機種名入力＞＞");
		String pcName = new java.util.Scanner(System.in).nextLine();

		System.out.println("PC機種名："+pcName);

		if(pcName.equals("PC-9801") || pcName.equals("VALUESTAR") || pcName.equals("Lavie")) {

		}
	}

}
