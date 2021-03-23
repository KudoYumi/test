package 白本8章33;

public class Car {
	public void drive() throws RuntimeException{
		System.out.println("driving a car");
	}

	public static Car create() {
		return new Taxi();
	}
}

class Taxi extends Car{ //非公開クラス
	@Override
	public void drive() throws RuntimeException{
		super.drive();
		System.out.println("サブメソッド");

		if(true) {
			throw new RuntimeException();
		}
		System.out.println("driving a taxi");
	}

	Taxi() {}
}
