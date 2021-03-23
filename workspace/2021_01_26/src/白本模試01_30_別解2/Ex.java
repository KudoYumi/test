package 白本模試01_30_別解2;
//Exで処理を終えず、catchして、別の例外に変換し、Mainに伝搬。

public class Ex {
	void exec() { //throwするのは非検査だからthrows略
		try {
			new RunEx().exec();
		}catch(Exception e) {
			System.out.println("例外を変換");
			throw new OriginalException(); //独自の非検査例外に変換
		}
	}
}
