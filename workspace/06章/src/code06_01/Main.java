package code06_01;
// 計算プログラム

public class Main {

	public static void main(String[] args) {
		int a=10;  int b=2;
		int total = tasu(a,b);
		int delta = hiku(a,b);

		System.out.println("足すと" +total+ "引くと" +delta);

	}


	public static int tasu(int a, int b) {
		/*static intなぜintなのかは、
		  returnで戻すものの型がintだから。
		  だから(a/3)とかの少数になる場合public static double waru(int a, int b)とかって書く*/
		return(a + b);
	}

	public static int hiku(int a ,int b) {
		return(a - b);
	}

}
