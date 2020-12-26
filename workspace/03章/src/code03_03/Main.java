package code03_03;

public class Main {

	public static void main(String[] args) {
// 関係演算子の条件式
		//関係演算子の判定はtrueかfalseしかでないboolean型

	String str = "朝日";
	if (str == "夕日") {
		System.out.println("夕日です");
	}else {
		System.out.println("夕日ではありません");
	}
	//一見正しく見えるけど、御法度ルール




	//正しくは
	String str1 = "夕日";
	if(str1.equals("夕日")) {
		System.out.println("夕日です");
	}else {
		System.out.println("夕日ではない");
		// equalsでboolean型になる。
		//文字列の比較は必ずequal使う！
	}

	}
}
