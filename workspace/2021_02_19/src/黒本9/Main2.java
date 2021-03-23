package 黒本9;

public class Main2 {
	public static void main(String[] args) {
		int cnt = 0;

		Func f = () ->
						{
							int n = cnt + 1;
							n *= 2;
							System.out.println("nの値は:"+n);
						};
		f.foo();
		
	}
}
