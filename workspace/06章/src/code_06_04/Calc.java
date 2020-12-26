package code_06_04;

import code06_02.CalcLogic;

public class Calc {

	public static void main(String[] args) {
		int a=10; int b=2;

		int total = CalcLogic.tasu(a,b);
		int delta = CalcLogic.hiku(a,b);

		System.out.println("和は"+total+"差は"+delta);
	}

}
