package 黒本05;

public class Sub extends Parent{

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.num);

		Sub s = new Sub();
		System.out.println(s.num);
	}
}
