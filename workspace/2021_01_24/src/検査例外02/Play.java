package 検査例外02;
//mainでcatchせずに伝搬ver
public class Play {
	public static void main(String[] args) throws OriginalException{

		new FunGame().setPlayer(null); //検査例外が発生しうる

	}
}
