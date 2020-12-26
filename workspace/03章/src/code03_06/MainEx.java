package code03_06;

public class MainEx {

	public static void main(String[] args) {
// 練習問題
	/*3-1
		①weight == 60;
		②(age1 + age2)*2 > 60;
		③age % 2 == 1   (age % 2 == 0は偶数);
		④name.equals("湊");
	*/


	/*3-2

	 */


	//3-3
		int isHungry = 0;
		String food;

		System.out.println("好きな食べ物は？");
		food = new java.util.Scanner(System.in).nextLine();

		System.out.println("こんにちは");

			if(isHungry==0) {
				System.out.println("おなかいっぱいです");
			}else {
				System.out.println("はらぺこです");
			}
			if(isHungry==1) {
				System.out.println(food+ "をいただきます");
			}

		System.out.println("ごちそうさまでした");



		//switchでも可能
		switch(isHungry) {
			case 0:
				System.out.println("おなか一杯");
				break;
			default:
				System.out.println("はらぺこです");
				System.out.println(food+ "をいただきます");
				break;
		}


		//三項条件演算子1行にまとめた版
		System.out.println(
				isHungry == 0 ? "おなかいっぱいです":
					"はらぺこです\n" + food + "をいただきます");



		//三項条件演算子はprintln専用ではない
		boolean x = isHungry == 0 ? false: true;
	}

}
