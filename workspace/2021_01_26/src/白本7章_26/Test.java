package 白本7章_26;

//staticなもののオーバーライド
public class Test {
	public static void main(String[] args) {
		ChildCalc sc = new ChildCalc();

		ParentCalc p = new ChildCalc();
		System.out.println(p.add(10, 20));
		System.out.println(sc.add(1, 13));

		ChildCalc c = (ChildCalc)p;
		System.out.println(c.add(100,34));
	}
}
