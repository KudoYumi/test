package 検査例外01;

public class FunGame {
	public String setPlayer(String name) throws OriginalException{
		if(name==null) {
			throw new OriginalException();
		}
		return "Hello"+name;
	}
}
