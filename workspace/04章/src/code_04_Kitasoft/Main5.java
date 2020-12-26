package code_04_Kitasoft;
// 4-5
public class Main5 {

	public static void main(String[] args) {
		int sum=0;

		for(int i=0; i<10; i++) {
			System.out.println("整数入力して");
			int x = new java.util.Scanner(System.in).nextInt();

			sum += x;
		}

		System.out.println("入力した整数の合計の平均は" + sum/10);
	}	//正確な平均値を出したいなら、sum/10.0とかすればいい。

}
