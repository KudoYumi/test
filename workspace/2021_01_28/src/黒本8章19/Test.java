package 黒本8章19;

public class Test {
	private static String blood = "";
	private String name;

	static {
		if(blood=="") {
			blood = "X型";
		}
		System.out.println("staticイニシャライザ");
	}


	{
		System.out.println("インスタンスイニシャライザ");

		try{
			if(name.length()==0) {
				name = "ななし";
			}
		}catch(NullPointerException e) {
			name = "ななし";
		}
	}

	public Test() {
		System.out.println("コンストラクタ起動");
	}


	public static void main(String[] args) {
		System.out.println();
		System.out.println(Test.blood);

		Test t = new Test();
		System.out.println(t.name);
	}
}
