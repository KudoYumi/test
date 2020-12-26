package code04_練習問題;

public class Main {

	public static void main(String[] args) {
// 練習問題

	//4-1
		int[] points = {1,2,3,4};
		double[] weights = {1.0, 2.0, 3.0, 4.0, 5.0};
		boolean[] answers = {true,true,false};
		String[] names = {"朝日","昼日","夕日"};

	//4-2
		int[] moneyList = {121902, 8302, 55100};

		for(int i=0; i<moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}

		for(int n : moneyList) {
			System.out.println(n);
		}


	//4-3
		//5行目はまずcountsが、nullでなんも定義されてないから
		//6行目はheights[0]とheight[1]しかないから。


	//4-4
		int[] numbers = {3,4,9};

		System.out.println("1桁の数字を入力してください");

		int input = new java.util.Scanner(System.in).nextInt();

		for(int n : numbers) {
			if(n == input) {
				System.out.println("アタリ！");
			}
		}
	}

}
