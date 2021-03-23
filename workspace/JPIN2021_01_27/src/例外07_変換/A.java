package 例外07_変換;

//例外の伝搬
public class A {
	public static void main(String[] args) throws TestException{ //JVMにスロー
		try{
			new B().test();
		}catch(SampleException e) {
			throw new TestException();
		}
	}
}
