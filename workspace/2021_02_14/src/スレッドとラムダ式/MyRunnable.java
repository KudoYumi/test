package スレッドとラムダ式;

public class MyRunnable {
	public static void main(String[] args) {
		Runnable r = () -> { for(int i=0; i<10; i++) {
							 System.out.print("["+i+"]"); }
						    };


		Thread th = new Thread(r);

		th.start(); //これでもう一個のスレッドが生成できた。

		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
	}
}
