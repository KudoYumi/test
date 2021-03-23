package 白本4_10;

public class AnyEquals {
	public static void main(String[] args) {
		String str1[] = {"AAA","BBB","CCC"};
		String str2[] = {"AAA","BBB","CCC"};
		String str3[] = new String[3];

		str3[0]="AAA";
		str3[1]="BBB";
		str3[2]="CCC";
		// str3 = {"AAA","BBB","CCC"}になった

		System.out.println(str1.equals(str2));
	}
}
