package インナークラス;

class OutClass {
	private final String name = "ゆみ";


	private class Inner{
		public void inSample() {
			System.out.println("インナークラス");
		}
	}

	void show() {
		System.out.println("showメソッド");
	}
}
