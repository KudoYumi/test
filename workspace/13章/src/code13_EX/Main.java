package code13_EX;

public class Main {

	public static void main(String[] args) {
		Wizard wz = new Wizard();
		Wand wnd = new Wand();
		Hero h = new Hero();

		h.setName("みなと");

		wnd.setName("いかずちの杖");
		wnd.setPower(50);

		wz.setName("すがわら");
		wz.setWand(wnd);

		wz.setMp(0);
		System.out.println(wz.getHp());
		wz.heal(h);

		System.out.println(wnd);


	}

}
