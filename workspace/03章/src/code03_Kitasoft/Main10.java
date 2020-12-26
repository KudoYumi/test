package code03_Kitasoft;
// 3-9
public class Main10 {

	public static void main(String[] args) {
		System.out.println
		("曜日を選んで>>0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int day = new java.util.Scanner(System.in).nextInt();

		System.out.println("時間帯選んで>>0=午前、1=午後、2=夜間");
		int time = new java.util.Scanner(System.in).nextInt();

		boolean hospitalOpen = true;


		if(day==0) {
			hospitalOpen=false;


		}else if(day==1 || day==4) {
			hospitalOpen=true;

		}else if(day==2 || day==5) {
			if(time==0) {
				hospitalOpen=false;
			}else {
				hospitalOpen=true;
			}

		}else if(day==3) {
			if(time==0 || time==1) {
				hospitalOpen=true;
			}else {
				hospitalOpen=false;
			}

		}else {
			if(time==0) {
				hospitalOpen=true;
			}else {
				hospitalOpen=false;
			}
		}


		if(hospitalOpen==true) {
			System.out.println("診療してます");
		}else {
			System.out.println("休みです");
		}


	}

}
