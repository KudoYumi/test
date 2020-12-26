package code04_14;

public class MainEx2 {

	public static void main(String[] args) {
// 4-11の拡張for文
		int[] scores = {20,30,40,50,80};
		int count = 0;

		for(int value : scores) {
			if(value>=50) {
				count++;
			}
		}

		System.out.println("50以上の科目は"+count);
	}

}
