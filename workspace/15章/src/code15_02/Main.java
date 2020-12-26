package code15_02;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java and JavaScript";

		if(s1.contains("Java")) {
			System.out.println("文字列s1はJavaを含んでいます");
		}

		if(s1.endsWith("Java")) {
			System.out.println("文字列s1は末尾にJavaがあります");
		}

		System.out.println("文字列s1で最初にJavaが登場する位置は"+ s1.indexOf("Java"));

		System.out.println("文字列s1で最後にJavaが登場する位置は"+ s1.lastIndexOf("Java"));

		System.out.println("s1でJが最初に登場するのは" + s1.indexOf('J'));
		System.out.println("s1でJが最初に登場するのは" + s1.indexOf(74));
		//理由はテキストP.755

		System.out.println("s1でaが最後の登場するのは" + s1.lastIndexOf('a'));
		System.out.println("s1でaが最後の登場するのは" + s1.lastIndexOf(97));

		System.out.println();



		String s2 = "ava and avaScript";

		if(s2.contains("Java")) {
			System.out.println("文字列s2はJavaを含んでいます");
		}

		if(s2.endsWith("Java")) {
			System.out.println("文字列s2は末尾にJavaがあります");
		}

		System.out.println("文字列s2で最初にJavaが登場する位置は"+ s2.indexOf("Java"));

		System.out.println("文字列s2で最後にJavaが登場する位置は"+ s2.lastIndexOf("Java"));
	}

}
