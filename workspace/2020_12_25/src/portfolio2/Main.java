package portfolio2;

public class Main {

	public static void main(String[] args) {
//		Fruits fr = new Fruits("りんご","赤",false);

		Item item = new Item("賢者の石",1000,new Fruits("りんご","赤",false));

		System.out.println(item.name);
		System.out.println(item.price);
		System.out.println(item.fr.name);
		System.out.println(item.fr.color);
	}

}
