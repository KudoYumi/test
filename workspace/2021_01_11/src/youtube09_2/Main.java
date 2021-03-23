package youtube09_2;

public class Main {
	public static void main(String[] args) {

		A a = new A();

		try {
			a.hello();
		}catch(SampleException e) {
			System.out.println("トラブル発生");
		}

	/* 以上より、例外がthrowされてきたからと言って
	 * すべてのクラスでcatchする必要はなくて、
	 * どこでcatchしてほしいのか、に注目。
	 *
	 * この場合はmainでcatchしてほしいから、
	 * Aではcatchせずに、throwする。
	 * という考え方。　これが例外の伝搬させる方法。
	 */
	}
}
