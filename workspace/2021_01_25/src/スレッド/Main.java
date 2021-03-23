package スレッド;

class MyRunnable implements Runnable{ //Runnableインターフェイス実装のクラスを定義

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print("*");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		//このインスタンスを下のthreadに渡す。

		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<50; i++) {
			System.out.print("#");
		}
	}
}
