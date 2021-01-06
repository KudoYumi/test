package youtubeラムダの話9;
// メソッドチェイン用いたラムダ式の応用

public class Main {
	public static void main(String[] args) {
		Item.save(item -> { //save()の中で新しいインスタンスが１個だけ生成されてた
			item.id("A110")
				.name("L100G")
				.description("sample")
				.price(1000);
		});
	/* saveメソッドにて自動生成された空のItemインスタンス
	 * に対しての処理内容を上記のように
	 * ラムダ式の中でメソッドチェインを使ってよりシンプルにした。
	 */
	}


}
