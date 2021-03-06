package わかりやすいJava1演習問題;

public class Main {

	public static void main(String[] args) {
		Seiseki[] se = new Seiseki[3];

		int[] score1 = {88,75,66};
		int[] score2 = {78,70,91};
		int[] score3 = {70,66,72};

		

		se[0] = new Seiseki("s2001","田中",score1,false);
		se[1] = new Seiseki("s2002","鈴木",score2,false);
		se[2] = new Seiseki("s2003","佐藤",score3,true);

		System.out.println("学籍番号"+"\t|"+"氏名"+"\t|"+"成績"+"\t|"+"受験欠席");

	/* 自分の回答
	 * 	for(Seiseki s:se) {
	 * 		System.out.println
			(s.getNumber()+"\t|"+s.getName()+"\t|"+s.getScore()+"\t|"+s.getAttend());
		}

		getScore()つまり、Seiseki型の配列変数scoreは
		上で定義した値の要素が入った参照リンク情報。
		きちんとその要素の基本型データを表示したい。
	 */

		for(Seiseki s:se) {
			String str = "{国語:"+s.getScore()[0]+
							" 数学:"+s.getScore()[1]+
								" 英語:"+s.getScore()[2]+"}";
		/* このs.getScore[i]のi=0～2のとこ
		 * もっとエレガントにできないかな？
		 */

			System.out.println
			(s.getNumber()+"\t|"+s.getName()+"\t|"+str+"\t|"+s.getAttend());
		}
	}

}
