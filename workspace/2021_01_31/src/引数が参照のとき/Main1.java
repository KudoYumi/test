package 引数が参照のとき;

public class Main1 {
	public static void main(String[] args) {
		int[] numbers = {10,20,25,30};
		plus(numbers);

		for(int i:numbers) {
			System.out.println(i);
		}
	}

	public static void plus(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i]++;
		}
		
	}
}
