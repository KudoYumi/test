package 例外クラス;

public class Main {
	public static void main(String[] args) {
		A a = new A();

		try{
			a.hog();
		}catch(Exception e) {
			System.out.println(e+"例が受けとた");
		}
	}
}
