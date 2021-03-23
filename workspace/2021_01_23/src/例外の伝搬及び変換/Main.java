package 例外の伝搬及び変換;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		try {
			a.use("");
			a.toString();
			System.out.println(a.equals(null));

		}catch(RuntimeException e) {
			System.out.println(e.toString());

		}catch(Exception e) {
			System.out.println(e.toString());

		}finally {
			System.out.println("例外処理終わり");
		}
	}
}
