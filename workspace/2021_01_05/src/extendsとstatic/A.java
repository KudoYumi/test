package extendsとstatic;

public class A {
	static int[] num = {10,21,33,45};

	A(){
		for(int i=0; i<num.length; i++) {
			num[i]++;
		}
	}

	public static void hoge(int x) {
		System.out.println(x++);
	}
}
