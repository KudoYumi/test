package 黒本10_27;

public class Main3 {
	public static void main(String[] args) {
		Sample[] array = { new Sample(10), new Sample(20)};

		Sample[] array2 = new Sample[2];

		System.arraycopy(array,0,array2,0,array.length);

		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]==array2[i]);
		}
	}
}

class Sample{
	int num;

	Sample(int num){
		this.num = num;
	}
}
