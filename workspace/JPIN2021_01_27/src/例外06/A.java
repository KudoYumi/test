package 例外06;

//例外の伝搬
public class A {
	public static void main(String[] args) {
		try{
			new B().test();
		}catch(SampleException e) {
			System.out.println("不正な値です");
		}
	}
}
