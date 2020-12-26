package code16_06;
import java.util.HashMap;
import java.util.Map;
// Map ペアの情報を格納できるクラス
public class Main {

	public static void main(String[] args) {
		Map<String,Integer>prefs = new HashMap<String,Integer>();
		prefs.put("京都府",255);
		prefs.put("東京都",1261);
		prefs.put("熊本県",181);

		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は"+tokyo);

		prefs.remove("京都府"); // ("京都府",255)を丸ごと削除
		/* Stringクラスにて9行目の"京都府"と、16行目の"京都府"は
		 * 等価と自動でみなしてくれる。
		 * " 京都府"とかは等価とみなしてくれない。
		 * " Kyoto"も"京都府"も"  きょうとふ"も等価とみなしたいなら、
		 * そのようなクラスを自分で定義すればいい。
		 */

		prefs.put("熊本県",182);

		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は"+kumamoto);


		if(! prefs.containsKey("京都府")) {
			System.out.println("京都府はないです");
		}

		System.out.println("中身の要素数は"+prefs.size()+"です");
		// キーが　東京、熊本の　二つのみしかないから２

		System.out.println(prefs.keySet());


		if(prefs.containsValue(1261)) {
			System.out.println("存在します");
		}else {
			System.out.println("存在しません");
		}


		prefs.clear(); //要素すべて削除
		if(prefs.isEmpty()) {
			System.out.println("空です");
		}

	}

}
