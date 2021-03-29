package イニシャライザ;

public class Ex2 {
	private int a = 10;
	static String name ;
	String id;

	static {
		System.out.println("staticイニシャライザstart");
		try {
			if(name.length()==0) { //NullPo
				System.out.println("名前の長さ0");
			}
		}catch(NullPointerException e) {
			System.out.println(e);
			System.out.println("例外処理完了");

		}finally {
			name = "a";
			System.out.println("staticイニシャライザ完了");
		}
	}


	public Ex2(int a, String id) {
		super();
		this.a = a;
		this.id = id;
	}


	{
		System.out.println("インスタンスイニシャstart");
		id = "E01";
		System.out.println("インスタンスイニシャend");
	}
}
