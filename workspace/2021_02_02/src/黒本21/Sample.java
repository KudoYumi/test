package 黒本21;

public class Sample {
	public static void main(String[] args) {
		Thread th = new Thread(new Function());
		th.start();
		System.out.println("finish");
	}
}
