package code8;

public class Dog extends Animal{

	Dog(String name,int age){
		super(name,age);
	}

	void run() {
		System.out.println("トコトコ");
	}

	public void speak() {
		System.out.println("わんわん");
	}
}
