package zoho;

public class Main8_2 {

	public static void main(String[] args) {
		System.out.print("合格点を入力>>");
		int winScore = new java.util.Scanner(System.in).nextInt();

		System.out.print("満点:100点　");
		System.out.println("合格点:"+winScore+"以上");


		String name[] = {"山田","鈴木","佐々木","田中","小林"};
		int score[] = {70,67,85,100,34};

		double sum = 0;

		//if(score[i]<winscore)なら不合格

		for(int i=0; i<name.length; i++) {
			System.out.print((i+1) +"\t"+ name[i] +"\t"+ score[i]+"\t");

			if(score[i]>=winScore) {
				System.out.println("合格");
			}else {
				System.out.println("不合格");
			}

			sum += score[i];
		}

		System.out.println("平均点は"+sum/name.length);


	}

}
