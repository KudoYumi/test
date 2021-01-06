package exe04;

public class Main {

	public static void main(String[] args) {
		JapaneseGreeting ja = new JapaneseGreeting();
		EnglishGreeting en = new EnglishGreeting();

		anyGreeting(ja);
		anyGreeting(en);
	}

	public static void anyGreeting(Greeting g) {
		g.greet();
		
		
		
	}

}
