package jpin質問用2;

public class Car {
	void drive(){
		System.out.println("car");
	}
}


class Taxi extends Car{
	@Override
	void drive() throws RuntimeException{
		System.out.println("taxi");
		throw new RuntimeException();
	}
}

