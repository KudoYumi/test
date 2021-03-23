package 白本01;

public class Taxi extends Car{
	@Override
	public void drive() {

		System.out.println("Driving a taxi");

	}

	public static void main(String[] args) {
		try{
			new Taxi().drive();
		}catch(Exception e) {

		}
	}
}
