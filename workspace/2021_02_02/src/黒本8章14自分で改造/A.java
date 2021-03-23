package 黒本8章14自分で改造;

public class A {
	private int num;

	public A(int num) {
		this.num = num;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof A) {
			A a = (A)obj;
			return this.num == a.num; //numが一緒なら同値
		}
		return false;
	}
}
