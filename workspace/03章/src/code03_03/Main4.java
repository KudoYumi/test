package code03_03;

public class Main4 {

	public static void main(String[] args) {
		/*(1)気温を入力
		  (2)湿度を入力

		  気温20～25℃かつ、湿度50％～60％の時、快適
		  それ以外は不快と表示したい。
		 */

		double temp;
		double wet;


		System.out.println("気温を入力して");
		temp = new java.util.Scanner(System.in).nextDouble();

		System.out.println("湿度を入力して");
		wet = new java.util.Scanner(System.in).nextDouble();

		if((20<=temp && temp<=25) && (50<= wet && wet<= 60)) {
			System.out.println("快適");
		}else {
			System.out.println("不快");
		}

	}

}
