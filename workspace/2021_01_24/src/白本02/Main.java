package 白本02;

public class Main {
	public static void main(String[] args) {
		int num = 3;

		if(!(num>3)) {
			System.out.println("abc");
		}
		{
			System.out.println("def");
			{
				System.out.println("ghi");
				{
					new Main(""
							+ "");
					System.out.println("jk");
				}
			}
		}
	}

	public Main(String s) {
		System.out.println("コンストラクタ起動");
	}

	public static class Inner{
		public void hoge() {

		}
	}
}
