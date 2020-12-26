package code8;

public class Main {

	public static void main(String[] args) {
		Animal[] animals =
			{new Cat("たま",3),new Dog("ポチ",1)};

		for(Animal a:animals) {
			a.showProfile();
			a.speak();
		}

	}
}
