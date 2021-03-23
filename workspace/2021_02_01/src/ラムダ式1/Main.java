package ラムダ式1;

public class Main {
	public static void main(String[] args) {

		Inter inter = Factory.create();

		System.out.println(inter.hello("ゆみ"));

		Inter inter2 = Factory2.create();
		System.out.println(inter2.hello("パンごろちゃん"));

		Inter inter3 = Factory2.create2();
		System.out.println(inter3.hello("パン吉"));
	}
}
