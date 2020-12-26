package zoho18;

public class Main {

	public static void main(String[] args) {

	//

		Kakeibo[] kakei = new Kakeibo[3];

		kakei[0] = new Kakeibo("3-16","牛乳","飲料","スーパーX",180);
		kakei[1] = new Kakeibo("3-16","豚肉","食料","スーパーX",450);
		kakei[2] = new Kakeibo("3-20","野菜","食料","スーパーX",400);

		System.out.print("合計したい日を入力＞");
		String my_day = new java.util.Scanner(System.in).nextLine();
		System.out.println();


		int sum = 0;

		for(int i=0; i<kakei.length; i++) {
			if(my_day.equals(kakei[i].getDate())) {
				sum += kakei[i].getPrice();

			}
		}
		if(sum == 0) {
			System.out.println("該当データ内です");
		}else {
			System.out.println
			(my_day+"の合計金額は"+sum+"です");
		}
	}

}
