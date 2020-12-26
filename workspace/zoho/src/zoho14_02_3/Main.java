package zoho14_02_3;

public class Main {

	public static void main(String[] args) {
		Game g = new Game();

			do {
				g.playGame();
			}while(g.myNum!=g.comNum);
	}

}
