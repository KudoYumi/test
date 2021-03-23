package 白本10_40;

public class Orange extends Fruit{
	@Override
	void foo() throws RuntimeException{
		System.out.println("Orangefoo");
		throw new RuntimeException();
	}
}
