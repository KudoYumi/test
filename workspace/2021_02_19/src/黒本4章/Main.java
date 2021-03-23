package 黒本4章;

public class Main {
	public static void main(String[] args) {
		String[] arrayA = {"a","b","c","d","e"};
		String[] arrayB = new String[arrayA.length];

		System.arraycopy(arrayA, 1, arrayB, 0, 4);

		for(String s:arrayB) {
			System.out.println(s);
		}
	}
}
