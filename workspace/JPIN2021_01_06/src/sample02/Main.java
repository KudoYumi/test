package sample02;

public class Main {
	public static void main(String[] args) {
		A[] array = new A[3];

		array[0] = new A();
		array[1] = new A();
		array[2] = new A();

		for(A a:array) {
			System.out.println(a);
		}
	}
}
