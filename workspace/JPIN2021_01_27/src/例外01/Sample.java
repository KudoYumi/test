package 例外01;

public class Sample {
	public static void main(String[] args) {

		try{
			int[] array = new int[0]; //文法上はエラーでない。
			array[0] = 10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("troble発生"); //これで復帰処理終わったてこと
		}

		System.out.println("hello");
	}
}
