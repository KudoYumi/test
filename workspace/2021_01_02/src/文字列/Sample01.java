package 文字列;

public class Sample01 {

	public static void main(String[] args) {
		String str1 = "こんにちは";

		char[] data1 = str1.toCharArray();
	/*	for(char c:data1) {
			System.out.println(c);
		} */

		byte[] data2 = str1.getBytes();
		for(byte b:data2) {
			System.out.print(b+",");
		}

		System.out.println(new String(data2));
	}

}
