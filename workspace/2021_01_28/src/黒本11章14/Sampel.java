package 黒本11章14;

public class Sampel {
	public static void main(String[] args) {
		Item[] items = new Item[3];

		items[0] = new Item("A");
		items[2] = new Item("B");

		for(Item i:items) {
			System.out.println(i.name);
		}
	}
}
