package code06_10;

// 複数の要素の大小関係を自動でやるには→
// PCに頼ることになるからこちらでもできて、6_10のMain2の自力での方法も可能にする！

public class Main {

	public static void main(String[] args) {

		int heights[] = {172,149,152,191,155};
		java.util.Arrays.sort(heights);

		for(int h:heights) {
			System.out.println(h);
		}
	}

}
