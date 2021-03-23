package 検査例外01;

public class Play {
	public static void main(String[] args) {
		String s = null;

		try{
			s = new FunGame().setPlayer("Mike"); //検査例外が発生しうる
		}catch(OriginalException e) {
			System.out.println("検査例外");
		}
		System.out.println(s);
	}
}
