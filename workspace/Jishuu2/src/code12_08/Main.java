package code12_08;

public class Main {

	public static void main(String[] args) {
		Monster mon[] = new Monster[3];

		mon[0] = new DeathBat();
		mon[1] = new Goblin();
		mon[2] = new Slime();

		for(int i=0; i<mon.length; i++) {
			mon[i].run();
		}

		for(Monster m:mon) {
			m.run();
		}

	}

}
