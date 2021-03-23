package 黒本03;

public class Main2 {
	public static void main(String[] args) {
		sample(2,3,4);
	}

	private static void sample(int...num) {
		for(int i:num) {
			System.out.println(i);
		}
	}
}
