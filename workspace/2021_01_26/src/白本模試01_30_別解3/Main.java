package 白本模試01_30_別解3;

public class Main {
	public static void main(String[] args) {
		try {
			new Ex().exec();
		}catch(OriginalException oe) {
			System.out.println("Mainで検査例外処理した");
		}finally {
			System.out.println("end");
		}
	}
}
