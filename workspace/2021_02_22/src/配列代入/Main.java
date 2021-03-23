package 配列代入;

public class Main {
	public static void main(String[] args) {
		X[] arrayX = {new A(),new B()};
		Object[] arrayObj = arrayX;
	//	C[] arrayC = (C[])arrayX;
	// これみたいにダイレクトにキャストしようとすると例外なのに


		X x1 = new A();
		X x2 = new B();

	//	C c1 = (C)x1;
	//	C c2 = (C)x2;
		C[] arrayC = {(C)x1,(C)x2};
	//こちらみたいに要素を直接キャストすると例外もない
	//やってることは上と一緒のはずなのに

	/* 	C[] arrayC = (C[])arrayX;
	 * てことはこの式と、C[] arrayC = {(C)x1,(C)x2}
	 * は一緒なようで、全く異なるものってこと？
	 */
	}
}
