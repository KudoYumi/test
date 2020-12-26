package code05_13;

public class Main {

	public static void incArray(int[] array) {
	/*	for(int n : array) {
			n++;
			System.out.println(n);
		}*/
		//これだとarrayから取り出した数値に1足してるだけで、
		//arrayの中の要素の数値をいじってるわけじゃないから間違ってる。
		//以下なら、要素の数字自体をいじれる！

		for(int i=0; i<array.length; i++) {
			array[i]++;
		}

	}


	public static void main(String[] args) {
		int[] array = {1,2,3};
		incArray(array); //incArrayメソッド実行
		for(int i : array) {
			System.out.println(i);
		}
	}

}
