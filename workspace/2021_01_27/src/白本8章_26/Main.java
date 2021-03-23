package 白本8章_26;

public class Main {
	public static void main(String[] args) throws Exception{
		ex();
	}

	static void ex() throws Exception{
		System.out.println("before");
		if(Math.random()*10 >5) {
			throw new Exception();
		}
		System.out.println("after");
	}
}
