package イニシャライザ;

public class Sample {
	private int num;
	private static String name;

	{ System.out.println("インスタンスイニシャライザ起動");
	  num = 10;

	  try {
		  throw new Exception();
	  }catch(Exception e) {
		  System.out.println("インスタンスイニシャライザの例外処理");
	  }
	 }

	static {
		name = "jana";
		System.out.println("staticイニシャライザ起動");
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("staticイニシャライザで例外処理");
		}
	}

	public static void main(String[] args) {
		System.out.println(new Sample().num);
	}
}
