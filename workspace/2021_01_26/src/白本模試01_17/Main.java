package 白本模試01_17;

public class Main {
	public static void main(String[] args) {
		Test t1 = new Test(10,"100");
		Test t2 = t1;
		Test t3 = new Test(10,"100");

		System.out.println(t1.getNo()==t3.getNo()); //true
		System.out.println(t2==t3); //false
		System.out.println(t2.getId()==t3.getId()); //true

		System.out.println();

		Test a = new Test(10,new String("200"));
		Test b = new Test(10,new String("200"));
		//これはnewで文字列生成したからidの==比較はfalse
		System.out.println(a.getId()==b.getId());
	}
}
