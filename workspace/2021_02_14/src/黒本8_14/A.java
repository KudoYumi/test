package 黒本8_14;

public class A {
	private int num;

	public A(int num) {
		this.num = num;
	}

	@Override
	public final boolean equals(Object obj) {
		A a = (A)obj;
		return this.num == a.num;
	}
	// こうしとけばBでオーバーライドされて変な動きしなくて済む。

	public int getNum() {
		return num;
	}

}
