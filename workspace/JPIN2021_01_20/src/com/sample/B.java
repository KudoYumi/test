package com.sample;

public class B extends A{
	private int num;

	public int getNum() {
		return num;
	}


/*	public int getNum() {
		return super.num; //Aのnumがprivateならアクセスはできない。
	}
*/
}
