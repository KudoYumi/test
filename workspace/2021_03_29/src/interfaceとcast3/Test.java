package interfaceとcast3;

public class Test {
	public static void main(String[] args) {
		X x1 = new Y();
		((A)x1).show(); //Yのインスタンスへの参照ゆえに正常にキャスト可能
		// Overrideされたshow()が動作する
	}
}
