package 例外02_2;

public class Sample {
	public static void main(String[] args) {

		try{
			int[] array = new int[0]; //文法上はエラーでない。
			A a = null;
			a.hello(); //参照先ないのに、そのhello()呼び出そうとしてる。

		}catch(ArrayIndexOutOfBoundsException | NullPointerException e) { //マルチキャッチ
			System.out.println("troble発生"); //これで復帰処理終わったてこと

		}
		System.out.println("hello");
	}
}
