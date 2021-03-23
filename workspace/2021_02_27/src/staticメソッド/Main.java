package staticメソッド;

public class Main {
	public static void main(String[] args) {
		Super s1 = new Super();
		Super s2 = new Sub();

		s1.hoge(); //Super.hoge()に変換
		s2.hoge(); //Super.hoge()に変換

		Sub s3 = new Sub();
		s3.hoge(); // Sub.hoge()に変換
	}
}
