package code8;

public class Cat extends Animal{

	Cat(String name,int age){
		super(name,age);
	}

	void sleep() {
		System.out.println("スースー");
	}


	public void speak() {
		System.out.println("ニャーニャー");
	}

}
