package ラムダ式2;

public class Main {
	public static void main(String[] args) {
		Inter i1 = (a,b) -> System.out.println(2*(a+b));

		Inter i2 = (a,b) -> System.out.println(b-a);

		Inter i3 =
			(a,b) -> {
						System.out.println("3つ目のラムダ式");
						System.out.println("積は"+a*b);
						System.out.println("差は"+(a-b));
					  };

		i3.math(3,5);
	}
}
