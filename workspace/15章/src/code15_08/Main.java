package code15_08;

public class Main {

	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[afh]","XY");

		String v = s.replaceFirst("[beh]","X");
		String u = s.replaceAll(".","X"); //sのすべての文字をXに

		System.out.println(w);
		System.out.println(v);
		System.out.println(u);



// メソッドチェーン
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("java").append("world");

		String a = sb.toString();
		System.out.println(a);
	}

}
