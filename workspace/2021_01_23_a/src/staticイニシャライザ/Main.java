package staticイニシャライザ;

public class Main {
	private static String name ;

	static {
		if(name==null) {
			name = "sample";
		}
	}

	public static void main(String[] args) {
		System.out.println("hello"+name);
	}
}
