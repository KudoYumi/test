package 白本9章;

public class Test {
	public static void main(String[] args) {
		String size = "Large";
		int number = 3;
		StringBuilder sb = new StringBuilder();

		sb.insert(0
				,size).append("apples,please");
		System.out.println(sb);
	}
}
