package kita6_5;

public class Main {

	public static void main(String[] args) {
		triangle(3,'$');
		triangle(4,'&');
		triangle(5,'*');
	}


	public static void triangle(int size,char c) {
		for(int i=0; i<size; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}

}
