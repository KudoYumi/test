package sample実装;

public class Main2 {
	public static void main(String[] args) {
		Operation add = (a,b) -> a+b;

		Operation minus = (a,b) -> a-b;

		Operation multi = (a,b) -> a*b;

		Operation div = (a,b) -> a/b;

		System.out.println(add.execute(100, 2034));

	}
}
