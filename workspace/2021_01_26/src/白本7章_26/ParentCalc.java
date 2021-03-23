package 白本7章_26;

class ParentCalc {
	protected static int add(int a,int b) {
		System.out.println("親クラス");
		return a+b;
	}
}

class ChildCalc extends ParentCalc{
	public static int add(int a,int b) {
		System.out.println("サブクラス");
		int c = a+b;
		return c;
	}
}

