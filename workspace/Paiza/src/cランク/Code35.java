package cランク;

public class Code35 {

	public static void main(String[] args) {
		String[] bunri = {"理系","文系","理系","理系","文系"};

		int[] eng = {70,68,63,90,88};
		int[] math = {78,81,76,100,78};
		int[] rika = {82,81,55,96,81};
		int[] kokugo = {57,60,80,10,97};
		int[] tiri = {74,78,75,10,93};

		String[] judge = new String[5];



		for(int i=0; i<bunri.length; i++) {
			if(eng[i]+math[i]+rika[i]+kokugo[i]+tiri[i]>=350) {

				if(bunri[i].equals("理系")) {
					if(math[i]+rika[i]>=160) {
						judge[i] = "合格";
					}else {
						judge[i] = "不合格";
					}

				}else if(bunri[i].equals("文系")) {
					if(kokugo[i]+tiri[i]>=160) {
						judge[i] = "合格";
					}else {
						judge[i] = "不合格";
					}
				}
			}else {
				judge[i]="不合格";
			}

		}
		//ここで全員の合否を定義できた。

		int cnt = 0;

			for(int i=0; i<5; i++) {
				if(judge[i].equals("合格")) {
					cnt++;
				}
			}

			System.out.println(cnt);




	}

}


