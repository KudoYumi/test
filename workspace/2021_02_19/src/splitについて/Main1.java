package splitについて;

public class Main1 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";

		String[] t = s.split("[,:]",6);

		for(String str:t) {
			System.out.println(str);
		}
	}
}
