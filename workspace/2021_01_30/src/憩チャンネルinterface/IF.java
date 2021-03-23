package 憩チャンネルinterface;

public interface IF {
	static void test() {  //自動的にpublicが追加される
		System.out.println("テストインターフェイス");
	}


	default void exe() {
		System.out.println("defaultメソッド");
	}
}
