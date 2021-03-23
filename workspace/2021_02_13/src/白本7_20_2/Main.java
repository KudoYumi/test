package 白本7_20_2;

public class Main {
	public static void main(String[] args) {
		Colibri coli = new Colibri();
		Bird bird = coli;

		bird.setInstance(coli);
		bird.twitter(); //Huming

		Bird b = new Bird();
		b.setInstance(coli);
		b.twitter();//Huming

		Bird b2 = new Bird();
		b2.setInstance(new Colibri());
		b2.twitter(); // Huming
	}
}
