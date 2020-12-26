package code05_11;

public class Main {

	public static int add(int x, int y) {
		return x + y;
	}
/*  public static int add(int zz, int aa){}とかは、
	5行目と同じとみなされてエラー*/

	public static int add(int x, int y, int z) {
		return x + y + z;
	}
/*  public static int add(int x, int z, int y){}
	のように入れ替えてもこれも11と同じ名前のメソッドだからエラー*/

	public static void main(String[] args) {
		System.out.println("10+20=" + add(10,20));

		System.out.println("10+20+30=" +add(10,20,30));
	}
}

// 必ず仮引数の個数、または　型が異なる場合しか同じ名前のメソッド定義できん。