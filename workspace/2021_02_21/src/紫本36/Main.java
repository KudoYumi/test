package 紫本36;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("12-34-56-78");
		String str = method(sb);
		System.out.println(str);
	}

	static String method(StringBuilder sb) {
		String str = "xx-xx-xx-";
		return str + sb.substring(9);
	}
}
