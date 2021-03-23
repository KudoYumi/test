package 黒本11章31;

public class Sample {
	int a,b;

	public static void main(String[] args) {
		int a=2, b=3;
		Sample s = new Sample(a,b);
		System.out.println(s.a+","+s.b);
	}

	public Sample(int a,int b) {
		init(a,b);
	}

	public void init(int a,int b) {
		this.a = a*a;
		this.b = b*b;
	}

}
