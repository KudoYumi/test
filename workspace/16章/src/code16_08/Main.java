package code16_08;
import java.util.ArrayList;
import java.util.List;   //.*使わないのは優先順位の関連

class Hero{
	public String name;
}


public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "みなと";

		List<Hero>list = new ArrayList<Hero>();
		list.add(h);
		h.name = "すがわら1";
		System.out.println(list.get(0).name);

		//静的メソッド以外でnewしたら、あくまでもインスタンスは1個のまま。
		//そして参照先も一緒だから、出力は「すがわら1」

	}
}
