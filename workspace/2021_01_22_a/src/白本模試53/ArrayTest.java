package 白本模試53;

public class ArrayTest {
	public static void main(String[] args) {
		try {
			arry();
		}catch(Exception e) {
			System.err.println(e);
		}
	}

	static void arry() {
		int[] ages = new int[5];
		try{
			ages[5]=10;
		}catch(NullPointerException e) {
			getRuntimeException();
		}
	}

	static void getRuntimeException() {
		throw new RuntimeException();
	}
}
