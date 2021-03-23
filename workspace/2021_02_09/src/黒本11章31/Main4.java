package 黒本11章31;

public class Main4 {
	public static void main(String[] args) {
		San[] array = { new San(10), new San(20) };

		San[] array2 = new San[3];

		System.arraycopy(array, 0, array2, 0, array.length);
		System.out.println(array==array2);
		System.out.println(array2[2]);
		
		
		System.out.println(array[1]==array2[1]);

	}
}

class San{
	int num;

	San(int num){
		this.num = num;
	}
}
