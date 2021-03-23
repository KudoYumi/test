package 黒本8章19;

public class Main2 {
	private static String name;

	static {
		try{
			if(name.length()==0) {
				name = "sample";
			}
		}catch(NullPointerException e) {
			System.out.println("例外処理");

			if(name==null) {
				name = "sample";
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("hello,"+name);
	}
}
