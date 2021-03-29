package 例外処理とOverride2;

class C extends P{
	@Override
	public void strToNum(String s) throws NumberFormatException{
		System.out.println("C:"+Integer.parseInt(s));
	}
}
