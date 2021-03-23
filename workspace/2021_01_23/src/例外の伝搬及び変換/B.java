package 例外の伝搬及び変換;

public class B {

	public void excep(String str) {//非検査例外だからthrows略
		if(str==null) {
			throw new NullPointerException();
		}else if(str=="") {
			throw new IllegalArgumentException();
		}
	}
}
