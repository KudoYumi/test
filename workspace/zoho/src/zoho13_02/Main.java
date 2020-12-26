package zoho13_02;

public class Main {

	public static void main(String[] args) {
		Mitsumori m1 = new Mitsumori();
		Mitsumori m2 = new Mitsumori();
		Mitsumori m3 = new Mitsumori();

		m1.disp("テーブル",30000,2,0.03);
		m1.dispTotal();

		m2.disp("椅子",8000,6,0.05);
		m2.dispTotal();

		m3.disp("タイル",300,50,0.1);
		m3.dispTotal();
	}

}
