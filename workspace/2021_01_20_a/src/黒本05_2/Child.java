package 黒本05_2;

import 黒本05.Parent;
public class Child extends Parent{

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.num);

		Child c = new Child();
		System.out.println(c.num);
	}
}

