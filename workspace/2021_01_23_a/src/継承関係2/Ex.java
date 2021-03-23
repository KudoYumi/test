package 継承関係2;

public class Ex extends Abs{
	int num = 100;

	public void run() {
		System.out.println(super.num);
		System.out.println("走れ");
	}
}
