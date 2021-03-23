package 白本8章31;

class Truck extends Car{
	@Override
	public void foo() throws Exception{
		super.foo();
		System.out.println("Child");
		throw new Exception();
	}

}

class Car{
	public void foo() throws Exception{
		System.out.println("Parent");
	//	throw new Exception();
	}
}

