package protectedについてother;
import protectedについて.Parent;

public class Child extends Parent{
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(Parent.num); //クラス変数だからアクセスできた
	//	System.out.println(p.hoge());
	//  インスタンスメソッドだからChildインスタンスからしかアクセス不可

		Parent c = new Child();
	//	c.hoge(); ポリモにより差分見てないからあくまでhoge()はアクセスできない。
	}
}
