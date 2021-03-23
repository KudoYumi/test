package 黒本02;

public class Main {
	public static void main(String[] args) {
		B obj1 = new A();
		T obj2 = new A();

		B a = (A)obj2;
		T t = (A)obj1;

		t.test();
		a.doIt();
	}
}
