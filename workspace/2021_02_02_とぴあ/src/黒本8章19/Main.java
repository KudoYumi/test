package 黒本8章19;

public class Main {
	private static String name;

	static {

		try{
			if(name.length()==0) { //nullのlength呼び出してる
				name = "sample";
			}
		}catch(NullPointerException e) {
			System.out.println("nameが設定されてません");

		}
	}

	public static void main(String[] args) {
		System.out.println("hello"+name);
	}
}
