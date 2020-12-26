package zoho20_16_1;

public class Main {

	public static void main(String[] args) {
		Monster m = new Monster(50);

		Hero h = new Hero("佐藤");

		System.out.println("モンスター現れた");

		do {
			h.attack(m);
		}while(m.hp>0);
	}

}
