package code8;

public class Main2 {

	public static void main(String[] args) {
		Animal[] animals = new Animal[4];

		animals[0] = new Cat("たま",3);
		animals[1] = new Dog("パンごろ",0);
		animals[2] = new Cat("みか",2);
		animals[3] = new Dog("パン吉",1);

		for(Animal a:animals) {
			a.showProfile();
			a.speak();
		}
	}

}
