package ex01;

import ex02.SubSample;

public class Main1 {
	public static void main(String[] args) {
		SubSample sub = new SubSample();

		sub.hoge();
		//理由はアクセス先がSuperSampleのhoge、
		//つまり同じパッケージ内だから。
	}
}
