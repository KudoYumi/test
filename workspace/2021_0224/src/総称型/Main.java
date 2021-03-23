package 総称型;

public class Main {
	public static void main(String[] args) {

		Hoge<String> hoge = new Hoge<>();
	// これでhogeに渡せる型はStringに指定された
		hoge.setValue("hoge");
	  //hoge.setValue(100); Stringで指定してるからIntegerはダメ

		Hoge<Integer> hoge2 = new Hoge<>();
		hoge2.setValue(100);

	/* この型パラメータのロジックも
	 * List<Super> list = new ArrayList<Sub>();
	 * てできない理由のひとつ。
	 */
	}
}
