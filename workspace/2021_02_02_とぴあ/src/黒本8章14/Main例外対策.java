package 黒本8章14;

public class Main例外対策 {
	public static void main(String[] args) {
		A a = new A(10);
		B b = new B(10);

		try {
			System.out.println(a.equals(b));
			System.out.println("正常に型変換ができました");

		}catch(ClassCastException e) {
			System.out.println("不正な型変換がされました");

		}finally {
			System.out.println("end");
		}
	}
}
