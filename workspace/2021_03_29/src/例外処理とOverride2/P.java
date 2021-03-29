package 例外処理とOverride2;

public class P {
	public void strToNum(String s) throws RuntimeException{
		System.out.println("P:"+Integer.parseInt(s));
	}
}
