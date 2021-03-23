package com.sample;

public class Factory {
	public static A create() {
		return new C();
	//Bのインスタンス生成し、その参照をA型として扱う。
	//Cを動かしたいなら、new C()てすればいい
	}
}
