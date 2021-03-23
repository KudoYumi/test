package equalsと例外;

public class B {
	private int num;

	public B(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		B b = (B)obj;
		return this.num == b.num;
	}

	public int getNum() {
		return num;
	}
}
