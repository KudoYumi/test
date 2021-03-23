package 白本継承01;

public class Main {
	public static void main(String[] args) {
		Dog dog;
		(new Main()).play(new Pug());
		
	}

	void play(Dog dog) {
		dog.walk();
	}
}
