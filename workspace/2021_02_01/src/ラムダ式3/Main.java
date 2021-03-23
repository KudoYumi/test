package ラムダ式3;

public class Main {
	public static void main(String[] args) {
		Inter inter = Factory.show();
		System.out.println(inter);

		System.out.println(inter.hoge("パンごろ",0));
		System.out.println(inter.hoge("パン吉",0));
	}
}
