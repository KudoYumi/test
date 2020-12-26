package code15_03;

public class Main {

	public static void main(String[] args) {
		String s1 = "  Java programming ";
		String s2 = "こんにちは";
		String s3 = "　　Java　programming　 　";

		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));

		System.out.println("文字列s1の4～8文字目は" + s1.substring(3,8));
		// 右側の終端位値は含まない


	//課題　s3の先頭と末尾の全角スペースなどを取り除いて「Java　programming」とするには？
		s1.replace("　", " ");  // "　"を" "と同じとみなす定義をする。
		//でもこれだとJavaとprogrammingの間の全角スペースも半角に置換されてしまう。



		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

		System.out.println(s2.replace("こんにちは", "Hello"));
	}

}
