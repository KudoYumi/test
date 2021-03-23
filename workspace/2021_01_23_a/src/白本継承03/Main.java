package 白本継承03;

public class Main {
	public static void main(String[] args) {

		Fruit f;
		if(args[0].equals("f")) { //今ここがtrueになるように設定
			f = new Fruit();
		}else {
			f = new Apple();
		}

		Apple a = (Apple)f; //間違ったダウンキャスト
		a.display();
	}
}
