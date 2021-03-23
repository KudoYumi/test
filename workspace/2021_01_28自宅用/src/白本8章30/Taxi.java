package 白本8章30;

public class Taxi extends Car{
	@Override
	void drive() throws RuntimeException{
		System.out.println("Taxi");
		throw new RuntimeException();
	}
}
