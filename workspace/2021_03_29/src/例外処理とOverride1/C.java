package 例外処理とOverride1;

class C extends P{
	@Override
	public void strToNum(String s) throws RuntimeException{
		System.out.println("C:"+Integer.parseInt(s));
	}
}
