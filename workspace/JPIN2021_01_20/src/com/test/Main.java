package com.test;

import com.sample.A; //省略表記可能になる
//import com.sample.test.A これはエラー
;

public class Main {
	public static void main(String[] args) {
	//	com.sample.A a = new com.sample.A(); //長い！→import
		A a = new A();

//com.sample.test.A使いたいなら、10行目のAと重複しないようにFQCNで指定
		com.sample.test.A a2 = new com.sample.test.A();
		

	}
}
