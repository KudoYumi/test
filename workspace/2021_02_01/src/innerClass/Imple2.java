package innerClass;

public class Imple2 implements SampleInter{
	public void execute() {
		System.out.println("実装クラス2");
	}


	public class Inner2 {
		public Inner2() {
			System.out.println("内部2クラスコンストラクタ");
		}
	}

	public class Inner3 implements SampleInter{
		public Inner3() {
			System.out.println("内部3コンストラクタ");
		}

		public void execute() {
			System.out.println("インナー3");
		}
	}
}
