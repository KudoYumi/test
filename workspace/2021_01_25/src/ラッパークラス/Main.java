package ラッパークラス;

public class Main {
	public static void main(String[] args) {

		//オートボクシング
		Boolean B1 = true;
		boolean b1 = B1.booleanValue();
		System.out.println(b1);

		Integer i = 32;
		System.out.println(i);
		i = null;
		int n = i;
	}
}
