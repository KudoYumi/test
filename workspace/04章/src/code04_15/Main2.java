package code04_15;

public class Main2 {

	public static void main(String[] args) {

		int[] arrayA = {1,2,3};
		int[] arrayB = {5,6,7};

		arrayA = arrayB;  // arrayB = arrayAにすると面白い結果に
		//理由はarrayA = arrayBだと、AにBを代入、つまりAがBに変わったから。
		//arrayB = arrayAだと、BにAを代入、つまりBがAに変わる。

		arrayB[0] = 100;  // B[0]に100を代入

		System.out.println(arrayA[0]);
		System.out.println(arrayA[1]);
		System.out.println(arrayA[2]);




	}

}
