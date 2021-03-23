package innerClass;

public class Factory {
	public static SampleImpl create() {
		return new SampleImpl();
	}

	private class Inner{
		{
			System.out.println("Innerコンストラクタ起動前");
		}

		public void execute() {
			System.out.println("Inner");
		}

		private Inner() {
			System.out.println("Innerコンストラクタ");
		}
	}


	private static class StaticInner{
		static {
			System.out.println("staticなインナークラス");
		}
	}

	public static Inner getInner() {
		return new Factory().new Inner();
	}
}
