package ラムダ式使う側;

import ラムダ式使われる側.MotherPrice;

public class Main1 {
	int sum;

	public static void main(String[] args) {

		MotherPrice motherprice =
			(double tax,int[] x) -> { Main1 m1 = new Main1();
									  for(int i:x) { m1.sum += i; }
									  System.out.println("税抜き価格は"+m1.sum);
									  return (int)(m1.sum*tax);
									};

		int[] prices = {100,200,253,300,538};
		int[] prices2 = {128,421,5632,9362,735,327,527,843};

		System.out.println(motherprice.total(1.1, prices));

		System.out.println(motherprice.total(1.08, prices2));
	}
}
