package code03_04;

public class Main3 {

	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運勢占うよ");

		int fortune = new java.util.Random().nextInt(5)+1;

		switch(fortune) {
		case 1:
		case 4:    //これは　1または4が出たとき、大吉って意味
			System.out.println("大吉");
			break;

		case 2:
			System.out.println("中吉");
			break;

		case 3:
			System.out.println("吉");
			break;

		default:
			System.out.println("凶");

	}

	}

}
