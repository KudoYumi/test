package 黒本10_25;

public class Main {
	public static void main(String[] args) {
		new Sample().sample();
		int num = Integer.parseInt(args[0]);//例外
		new Test().test(num);
	}
}
