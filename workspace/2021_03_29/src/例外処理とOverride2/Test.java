package 例外処理とOverride2;

public class Test {
	public static void main(String[] args) {
		P c = new C();

		try {
			c.strToNum("a"); //ポリモ
		}catch(NumberFormatException e) { // 検査例外の場合も考える
			System.out.println(e);
		}
	}
}
