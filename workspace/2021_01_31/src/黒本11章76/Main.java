package 黒本11章76;

public class Main {
	public static void main(String[] args) {
		int[] array = {2,3,4};
		int[] array2 = array.clone();

		System.out.println(array==array2); //異なるインスタンスへの参照ゆえfalse
		array2[0] = 5;

		for(int i:array) {
			System.out.print(i+" ");
		}
		System.out.println();

		for(int i:array2) {
			System.out.print(i+" ");
		}
	}
}
