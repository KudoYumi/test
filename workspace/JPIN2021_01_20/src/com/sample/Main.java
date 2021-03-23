package com.sample;

public class Main {
	public static void main(String[] args) {
		B b = new B();
		b.test();
	/* BはAを継承してるからtest()が呼び出せた。
	 * BはAの内容を引き継いでいるから。
	 */

		B b2 = new B();
		b2.setNum(100);
		System.out.println(b2.getNum());
	}
}
