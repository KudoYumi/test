package 黒本4_9;

public class Main {
	public static void main(String[] args) {
		A[] array = {new C(),new D()};
		Object[] abjArray = array;

		for(A obj : (A[])abjArray) {
			obj.foo();
		}
	}
}
