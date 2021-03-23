package 白本8章_29;

public class Taxi extends Car{
	public static void main(String[] args) {
		Car car = new Taxi();

		try{
			car.speed("80");
		}catch(Exception e) {

		}
	}

	int speed(String s) {
		return Integer.parseInt(s);
	}
}
