package 黒本7章5;

public abstract class A {
	public void sample() {
		System.out.println("A");
		test();
		System.out.println("C");
	}

	protected abstract void test();
}
