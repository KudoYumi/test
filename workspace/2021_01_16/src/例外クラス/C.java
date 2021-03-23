package 例外クラス;

public class C {

	public void hoge(String s) throws Exception{
		if(s==null) {
			throw new Exception("例外発生");
		}else if(s=="") {
			throw new RuntimeException("空欄です");
		}
	}
}
