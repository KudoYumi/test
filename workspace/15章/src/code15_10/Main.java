package code15_10;

public class Main {

	public static void main(String[] args) {
		long start1 = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<100000; i++) {
			sb.append("Java");
		}
		String s1 = sb.toString();

		long end1 = System.currentTimeMillis();
		System.out.println("処理にかかった時間は"+(end1-start1)+"ミリ秒です");




		long start2 = System.currentTimeMillis();
		String s2 = "Java";
		for(int i=0; i<100000; i++) {
			s2 = s2 + "Java";
		}

		long end2 = System.currentTimeMillis();
		System.out.println("処理にかかった時間は"+(end2-start2)+"ミリ秒です");

		long t1 = end1-end2;
		long t2 = end2-end2;

		System.out.println(t2/t1);

	}

}
