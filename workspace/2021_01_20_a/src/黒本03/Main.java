package 黒本03;
//staticイニシャライザ

public class Main {
	private static String name;

	static {
		if(name.length()==0) {
			name = "sample";
		}
	}

	public static void main(String[] args) {
		System.out.println("hello,"+name);
	}
}
