package 黒本8章;

public class Main {
	public static void main(String[] args) {
		int result = sample();
		System.out.println(result);
	}

	static private int sample() {
		int val = 0;
		try {
			String[] array = {"A","B","C"};
			System.out.println(array[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			val = 10;
			return val;
		}finally {
			System.out.println("finallystart"+val); //catchが実行されたら10 されないときは0
			val += 10;
			System.out.println("finallyend"+val); //catch実行されたら20 されないときは10
		//	return val;
		}
		return val; //10
	}
}
