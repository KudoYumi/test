package 白本7_20;

public class Main {
	public static void main(String[] args) {
		Colibri c = new Colibri();
		Bird bird = new Bird();

		bird.setInstance(c);
		bird.twitter(); //Huming
		
	}
}
