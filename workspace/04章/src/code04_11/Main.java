package code04_11;

public class Main {

	public static void main(String[] args) {
//カウント集計 50以上の科目数調べる

		int[] scores = {20,30,40,50,80};
		int count = 0;

		for(int i=0; i<scores.length; i++) {
			if(scores[i] > 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目数は"+count);
	}

}
