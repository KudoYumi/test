package 黒本9章;
//23
public class Main1 {
	public static void main(String[] args) {

		Function f = val -> System.out.print(val);//引数を表示するだけの実装

		f.test("B");
	}
}

interface Function{
	void test(String val);
}
