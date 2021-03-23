package 白本6章36;

public class Juice {
	static Orange foo(Orange ora) {
		ora = new Orange(100);
		return ora;
	}

	public static void main(String[] args) {
		Orange orange = new Orange(200);
		System.out.println(orange.getX()); //200
		System.out.println(orange); //orangeの参照先のリンク

		orange = foo(orange); //戻り値は100がフィールドのインスタンスへの参照
		System.out.println(orange.getX()); //100
		System.out.println(orange); //
	//10行目で生成されたインスタンスは参照されてないからガレージコレクション
	}
}
