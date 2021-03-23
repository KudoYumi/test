package 黒本継承;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();

		System.out.println(a.val); //クラスAのフィールド
		System.out.println(b.val); //定義によりAクラスのフィールド

		a.print(); //インスタンスはA型だからAのprintメソッド
		b.print(); //インスタンスはB型だからBのprint
	}
}
