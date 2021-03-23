package 白本6_15;

import static 白本6_15.Int.*;

public class Int {
	static int i;
}

class Main{
	public static void main(String[] args) {
		i = 10;
		sum(i);
		System.out.println(i);
	}

	static void sum(int i) {
		Int.i += i;
		
		
	}
}
