package ラムダ式黒本9_23;

public class Main {
	static String val = "A";
	String name;

	public static void main(String[] args) {
		Function f2 = val -> System.out.println(val);
		System.out.println(val);
		
		
		Function f = (String val) -> System.out.println(val);
		f.test(val);
		System.out.println(val);
	//	new Main().call();
	}

	public void call() {
		Function f2 = val -> System.out.println(val);
		f2.test(name);
	}

	/* つまりローカル変数の名kで
	 *
	 */
}
