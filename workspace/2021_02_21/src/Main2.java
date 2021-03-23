
public class Main2 {
	public static void main(String[] args) {
		String str = "a. b. c. d. e";
		String[] arry = str.split("\\s\\.");

		for(String s:arry) {
			System.out.println(s);
		}
	}
}
