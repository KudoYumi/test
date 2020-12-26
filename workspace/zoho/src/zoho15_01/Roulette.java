package zoho15_01;

public class Roulette {
	int number;
	String color;
	String eo;

	public void numberTocoloror() {
		switch(number) {
		case 0:
			this.color = "緑";
			break;

		case 1: case 3: case 7: case 9:
		case 12: case 14: case 16: case 18: case 19:
		case 21: case 23: case 25: case 27: case 30:
		case 32: case 34: case 36:
			this.color = "赤";
			break;

		default:
			this.color = "黒";
		}
	}

	public void evenOrOdd() {
		if(number%2 == 0) {
			eo = "偶数";
		}else {
			eo = "奇数";
		}
	}


	public void play() {
		int x = new java.util.Random().nextInt(37);
	}


}
