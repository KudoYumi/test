package code03_Kitasoft;

//3-7
public class Main7 {

	public static void main(String[] args) {
		System.out.println("得点を入力してください");
		int x = new java.util.Scanner(System.in).nextInt();
		// xは0<=x<=100とする。

	// ケース１
		if(x>=60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}


	// ケース２
		if(x>=80) {
			System.out.println("たいへんよくできた");
		}else if(x>=60) {
			System.out.println("よくできた");
		}else {
			System.out.println("残念");
		}

	// ケース３
		if(x>=80) {
			System.out.println("優");
		}else if(x>=70) {
			System.out.println("良");
		}else if(x>=60) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}


	}

}

