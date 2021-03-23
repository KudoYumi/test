package 白本9章lambda21;

public class Main {
	public static void main(String[] args) {
		Algorithm algo = name -> System.out.println("hello,"+name);
	/* interface Algorithmの実装したクラスの内容は
	 * 引数nameを用いて「hello+name」と表示。
	 *
	 * ポリモにより、
	 * algo.perform(name)は「hello,name」
	 */
		Service s = new Service();
		s.setLogic(algo);

		s.doProcess("Lambda");

	}
}
