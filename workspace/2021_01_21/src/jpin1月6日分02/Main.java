package jpin1月6日分02;

public class Main {
	public static void main(String[] args) {

		List list = new List(); //引数ある方のコンストラクタは非公開だから使えない

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");



		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
