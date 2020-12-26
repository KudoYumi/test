package code16_07;
import java.util.HashMap;
import java.util.Map;
public class Main {

	public static void main(String[] args) {
		Map<String,Integer>prefs = new HashMap<String,Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 182);


		for(String key : prefs.keySet()) {
			int value = prefs.get(key);

			System.out.println(key + "の人口は" + value +"です");
		}


		// HashMapは順番がないので、普通のfor文は使えない
		/* だから京都府のint要素255とかを+1とかして("京都府",256)てしたい場合、
		 * for文使って+1することはできない。
		 *
		 * get("京都府")で255を取得後、+1する。
		 * それをget("京都府")で表示すれば256を得られる。
		 * 以下では×２の時を実行した。
		 */


		//京都の人口を２倍にしてみる
		int x = prefs.get("京都府")*2;
		prefs.put("京都府",x);
		// 2行をまとめて、prefs.put("京都府",prefs.get("京都府")*2);　としてもいい

		System.out.println("京都の人口の２倍は"+prefs.get("京都府"));
	}

}
