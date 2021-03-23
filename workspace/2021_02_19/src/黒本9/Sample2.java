package 黒本9;

public class Sample2 {
	public static void main(String[] args) {
		String val = "Hello";

		Func f = ()-> { System.out.println(val);
					    System.out.println("valは"+val);
					   };
		f.foo();
	}
}
