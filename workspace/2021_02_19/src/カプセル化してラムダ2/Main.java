package カプセル化してラムダ2;

import カプセル化してラムダ.Algorithm;
import カプセル化してラムダ.Service;

public class Main {
	public static void main(String[] args) {
		Algorithm logic = Algorithm.create(); //右辺の中身は実装インスタンス

		Service s = new Service(logic);
		s.doProcess("ラムダ",3);
	}
}
