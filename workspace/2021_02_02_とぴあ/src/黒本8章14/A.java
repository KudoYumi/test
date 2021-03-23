package 黒本8章14;

public class A {
	private int num;

	public A(int num) {
		this.num = num;
	}


	@Override
	public boolean equals(Object obj) {
		A a = (A)obj; //無理やりキャスト
		return this.num == a.num; //numが一緒なら同値

	}
}
