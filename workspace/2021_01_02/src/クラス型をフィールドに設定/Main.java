package クラス型をフィールドに設定;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero("みなと",500,new Sword("炎の剣",100));

		System.out.println("現在の装備は"+h.sword.name);
		System.out.println(h.sword.name);
		h.attack();

	}
}
