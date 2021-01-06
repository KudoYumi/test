package exercise5;

public class StaticAdder {
	private static int number;


	public void add() {
		number++;
	}

	public static void main(String[] args) {
		//mainメソッドは必ず最初に実行されるからstaticでないとダメ
		number = 100;
	//	this.add();
	//	add();
		System.out.println("number="+number);
		new StaticAdder().add();

		System.out.println(number);
	}
}