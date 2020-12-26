package code04_15;

public class Main {

	public static void main(String[] args) {
// 配列の理解
		int[] arrayA = {1,2,3}; //arrayA[0]は1
		int[] arrayB;

		arrayB = arrayA;
		arrayB[0] = 100; //arrayB[0]に100代入
		System.out.println(arrayB[1]);

	}

}
