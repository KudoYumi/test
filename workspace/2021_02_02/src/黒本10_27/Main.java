package 黒本10_27;

public class Main {
	public static void main(String[] args) {
		try {
			throw new Exception();

		}catch(RuntimeException e) {
			System.out.println("A");

		}catch(Exception e) {

			try{
				throw new RuntimeException();

			}catch(RuntimeException re) {
				System.out.println("ネスト例外");

			}


		}finally {
			System.out.println("B");
		}
	}
}
