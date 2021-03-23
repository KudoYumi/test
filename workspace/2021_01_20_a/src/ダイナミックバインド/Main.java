package ダイナミックバインド;

public class Main {
	public static void main(String[] args) {
		B b = new B();
		A a = b; //ポリモ代入

		a.run();
	//	a.hoge();

	}
}
