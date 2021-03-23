package 黒本01;

public class Sample {
	public static void main(String[] args) {
		String a = "A";
		String b = null;

		if(a.equals("A")) {
			b = "test";
		}else if(a.equals("B")){
			b = "sample";
		}

		b = b + "hello";
		System.out.println(b);
	}
}
