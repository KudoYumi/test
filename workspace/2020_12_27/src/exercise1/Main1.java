package exercise1;

public class Main1 {

	public static void main(String[] args) {
		int[] score1 = {88,75,66};
		int[] score2 = {78,70,91};
		int[] score3 = {70,66,72};

		Seiseki[] seisekis = {new Seiseki("s001","田中",score1,false),
							  	new Seiseki("s002","鈴木",score2,false),
							  	 	new Seiseki("s003","里井",score3,true)};

		System.out.println("学籍番号 \t| 氏名 \t| 成績 \t| 受験欠席");



		for(Seiseki se:seisekis) {

			String str = "{"+se.getScore()[0] +","+ se.getScore()[1] +","+ se.getScore()[2]+"}";

			System.out.println
			(se.getNumber()+" \t|"+se.getName()+" \t|"+str+" \t|"+se.getAttend());
		}
	}

}
