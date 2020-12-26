package zoho13_02_02;

public class Rectangle {
	double x;
	double y;
	double z;
	double dencity;
	double volume;
	double weight;

	public void calcVolume() {

		this.volume = x*y*z;
	}

	public void calcWeight() {

		this.weight = x*y*z*dencity;
	}

	public void printVolume() {
		this.calcVolume();
		System.out.printf("体積＝"+this.volume);
	}

	public void printWeight() {
		this.calcWeight();
		System.out.printf("重さ＝"+this.weight);
	}
}
