package 黒本8章01;

public class Main2 {
	public static void main(String[] args) {
		System.out.println(test(null));
	}

	public static String test(Object obj) {
		try {
			System.out.println(obj.toString());
			System.out.println("tryブロック終わり");

		}catch(SubNullException se) {
			System.out.println("SubNullでcatch");
			return "A";

		}catch(NullPointerException ne)	{
			System.out.println("NullPoでcatch");

			try {
				test("hello");

			}finally {
				System.out.println("ネスト処理完了");
			}
			return "B";

		}
		System.out.println("catchブロック終わり");
		return "Return";
	}
}
