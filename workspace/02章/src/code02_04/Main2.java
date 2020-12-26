package code02_04;

public class Main2 {

	public static void main(String[] args) {
		int a;
		a = 100;
		a = a + 3; // aに3足したものを改めてaと定義て意味。
		System.out.println(a);

		int A = 100;
		System.out.println(A+=3);

		A++;
		System.out.println(A);
		//上でAに3加えてるから104でオッケー？


	//インプリメント演算子について。
		int b = 200;
		++b;
		System.out.println(b);
		//なんで出力段階でb++とすると結果が201にならないの？

	}

}
