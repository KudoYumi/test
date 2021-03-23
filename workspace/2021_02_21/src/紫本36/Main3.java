package 紫本36;

public class Main3 {
	public static void main(String[] args) {
		String phone = "03-1234-5678";
		String x = "**-****-";

		StringBuilder sb = new StringBuilder(phone);
		sb.substring(8,12);
		System.out.println(sb);
	}
}
