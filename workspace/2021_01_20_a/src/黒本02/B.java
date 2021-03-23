package 黒本02;

public class B extends A{
	private int num;

	public B(int num) {
		super(num);
		this.num = num;
	}

	public boolean equals(Object obj) {
		B b = (B)obj;
		return this.num == b.num;
	}
}
