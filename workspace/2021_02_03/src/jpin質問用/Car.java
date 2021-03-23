package jpin質問用;

public class Car {
	void drive() throws Exception{
		System.out.println("car");
		throw new Exception();
	}
}


class Taxi extends Car{
	@Override
	void drive() throws RuntimeException{
		System.out.println("taxi");
		throw new RuntimeException();
	}
}
