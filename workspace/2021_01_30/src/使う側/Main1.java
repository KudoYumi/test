package 使う側;

import 使われる側.Inter;

public class Main1 {
	public static void main(String[] args) {

		Inter a = Inter.createA();
		Inter b = Inter.createB();
		Inter c = Inter.createC();

		System.out.println(a.hello("アナスタシア"));
		System.out.println(b.hello("アナスタシア"));
		System.out.println(c.hello("アンドレア"));
	}
}
