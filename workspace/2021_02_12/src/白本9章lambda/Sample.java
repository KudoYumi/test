package 白本9章lambda;

public class Sample {
	public static void main(String[] args) {
		for(int cnt=0; cnt<10; cnt++) {
			System.out.print(cnt+++",");
		}

		Runnable r =
				() -> { for(int cnt=0; cnt<10; cnt++) {
							System.out.print(cnt+++",");
						} };

		new Thread(r).start();
	}
}
