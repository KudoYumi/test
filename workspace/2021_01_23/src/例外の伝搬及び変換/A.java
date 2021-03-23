package 例外の伝搬及び変換;

public class A {

	public void use(String val) throws Exception,RuntimeException{
		B b = new B();

		try{
			b.excep(val);
		}catch(NullPointerException ne) {
			System.out.println("nullが代入されたためエラー");
			throw new RuntimeException();

		}catch(IllegalArgumentException ie) {
			System.out.println("不正な値が代入された");
			throw new Exception();

		}finally {
			System.out.println("Aでの処理完了");
		}
	}
}
