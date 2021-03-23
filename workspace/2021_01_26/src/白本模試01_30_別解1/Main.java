package 白本模試01_30_別解1;

public class Main {
	public static void main(String[] args) {
		try {
			new Ex().exec();
		}catch(Exception e) {
			System.out.println("Mainで例外処理した");
		}finally {
			System.out.println("end");
		}
	}
}
