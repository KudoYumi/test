package ラムダ式;

public class Main2 {
	static int cnt = 10;

	public static void main(String[] args) {
		Runnable r = () -> { for(cnt=0; cnt<10; cnt++) {
								System.out.println(++cnt);
							} };

		new Thread(r).start();

	/*	int x = 0;
		Runnable r2 = () -> System.out.println(x);
		x++; //エラー
	*/
	}
}
