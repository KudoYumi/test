package code05_14;

public class Main {

	public static int[] makeArray(int size) {
		int[] newArray = new int[size];

		for(int x : newArray) {
			System.out.println(x);
		}
		return newArray;

	}

	public static void main(String[] args) {
		int[] array = makeArray(3); //makeArrayメソッド呼び出し
		for(int i : array) {
			System.out.println(i);
		}
	}

}
