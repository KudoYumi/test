package equalsと例外;

public class A {
	private int num;

	public A(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		A a = (A)obj;
		return this.num == a.num;
	}

	public int getNum() {
		return num;
	}

}
