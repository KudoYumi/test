package イニシャライザ;

public class Main {
	public static void main(String[] args) {
	/*	System.out.println(Ex2.name); //a
		System.out.println();
	*/
		System.out.println(new Ex2(10,"AAA").id);

		System.out.println("次のインスタンス生成");
		new Ex2(20,"BBB");
	}
}
