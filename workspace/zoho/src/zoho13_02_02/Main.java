package zoho13_02_02;

public class Main {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();

		rec1.x = 2.0;
		rec1.y = 3.0;
		rec1.z = 4.0;
		rec1.dencity = 0.5;
		rec1.calcVolume();
		rec1.printVolume(); //rec1の体積計算
		rec1.printWeight(); //rec1の重さ計算

		rec2.x = 1.0;
		rec2.y = 2.0;
		rec2.z = 3.2;
		rec2.dencity = 0.5;
		rec2.calcVolume();
		rec2.printVolume(); //rec2の体積計算
		rec2.printWeight(); //rec2の重さ計算
		System.out.println();

		double taisekisa = rec1.volume - rec2.volume;
		double omosasa = rec1.weight - rec2.weight;

		System.out.println("体積の差＝"+taisekisa);
		System.out.println("重さの差＝"+omosasa);


	}

}
