package 黒本02;
// 8章14

public class A {
	private int num;

	public A(int num) {
		this.num = num;
	}

	public boolean equals(Object obj) {
		A a = (A)obj;

		if(obj instanceof A) {
			return this.num == a.num;
		}
		return false;
	}
}
