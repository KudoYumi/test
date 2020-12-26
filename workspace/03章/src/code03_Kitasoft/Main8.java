package code03_Kitasoft;
// 3-8
public class Main8 {

	public static void main(String[] args) {
		System.out.println("中間の点数");
		int x = new java.util.Scanner(System.in).nextInt();

		System.out.println("期末の点数");
		int y = new java.util.Scanner(System.in).nextInt();


		if( (x>=60 && y>=60) ||
			((x+y)>130) ||
			((x+y)>=100 && (x>=90 || y>=90))
		  ) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}


	}

}
