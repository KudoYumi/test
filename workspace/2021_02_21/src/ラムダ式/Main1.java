package ラムダ式;

public class Main1 {
	static int cnt = 0;

	public static void main(String[] args) {
	//	int cnt = 0;
		Runnable r = () -> System.out.println(++cnt);
	//	new Thread(r).start();
		System.out.println(cnt);
		cnt++;
	}
}
