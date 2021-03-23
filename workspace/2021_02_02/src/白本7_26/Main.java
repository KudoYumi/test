package 白本7_26;

public class Main {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.add(1, 4)); //Child.add(1,4)→5
		System.out.println(Child.add(6,3));
	}
}
