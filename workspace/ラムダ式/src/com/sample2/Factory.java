package com.sample2;

//インナークラス
public class Factory {
	public static Sample create() {
		return new Factory().new InnerSample();

	/* これでInnerクラスのインスタンスへの参照が作られて
	 * その参照がSample型として戻せる。
	 */
	}

	private class InnerSample implements Sample{ //Factory以外からはアクセス不可
		@Override
		public void execute() {
			System.out.println("Inner Class");
		}
	}
}
