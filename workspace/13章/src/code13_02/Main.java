package code13_02;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		King k = new King();

	//	h.setName("翼");

		k.talk(h);

		Test t = new Test();
		t.test();
	}
}


class Test{
	public void test() {
		System.out.println("テスト");
	}
}
