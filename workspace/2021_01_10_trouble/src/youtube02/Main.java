
package youtube02;

public class Main {

	public static void main(String[] args) {

		try {
			Object obj = null;
			System.out.println(obj.toString());
		//参照先ないのにtoStringメソッド呼び出そうとしてる。

		}catch(NullPointerException ex) {
			System.out.println("復帰完了");
		}
		System.out.println("OK");
	}

}
