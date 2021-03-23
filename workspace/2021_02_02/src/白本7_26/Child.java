package 白本7_26;

class Child extends Parent{
	public static int add(int a,int b) {
		int c = Parent.add(a, b);
		return c;
	}
}
