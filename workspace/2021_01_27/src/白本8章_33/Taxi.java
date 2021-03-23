package 白本8章_33;

public class Taxi extends Car{
	public static void main(String[] args) {
		Car c = new Taxi();
		try{
			c.drive();
		}catch(Exception e) {
			System.out.println();
		}
	}

	public void drive() throws RuntimeException{
	//	super.drive();
	//	System.out.println("スーパーのメソッド呼ばれた");
		if(Math.random()>0.5) {
		//	throw new Exception();
		}
		System.out.println("taxi");
	}

}
