package 白本模試01_30_別解2;

public class Main {
	public static void main(String[] args) {
		try {
			new Ex().exec();
		}catch(RuntimeException re) {
			System.out.println("Mainで非検査例外処理した");
		}finally {
			System.out.println("end");
		}
	}
}
