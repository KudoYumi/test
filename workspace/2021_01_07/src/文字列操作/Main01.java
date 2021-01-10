package 文字列操作;

public class Main01 {
	public static void main(String[] args) {
		String s1,s2,s3,s4;

		s1 = "スッキリJava";
		s2 = "Java";
		s3 = "java";
		s4 = "";

		System.out.println(s2.equals(s3));

		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println("s1の長さは"+s1.length());
		System.out.println(s4.isEmpty());
	}
}
