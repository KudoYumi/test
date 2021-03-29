package interfaceとcast;

public class Test {
	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new Y();

		((Y)x2).show(); //((Y)x2)でもとのYのインスタンスへの参照

		A a = (A)x1; //コンパイルは通るが実行時にClassCast例外
	}
}
