package 黒本4_9;

public class Main {
	public static void main(String[] args) {
		A[] aryA = {new C(),new D()};

		for(A a:aryA) {
			((C)a).hoge();
		}
	}
}
