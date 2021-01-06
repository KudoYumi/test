package exe08;

import exe07.Super;

public class Sub extends Super{
	private int num;

	public Sub(int num) {
		super("ゆみ");
		this.num = num;
	}

	public void print() {
		System.out.println(name); //Superの名前
	}
}
