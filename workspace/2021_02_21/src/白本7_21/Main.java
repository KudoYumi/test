package 白本7_21;

public class Main {
	public static void main(String[] args) {
		Fruit f;

		if(args[0]=="") {
			f = new Fruit();
		}else {
			f = new Apple();
		}

		Apple a = (Apple)f;
		a.disp();
	}
}
