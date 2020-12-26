package code14_05;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "みなと";
		h.hp = 100;


		System.out.println(h.toString());

		Object o = h;
		System.out.println(o.toString());
		//箱oにはtoStringあるから、オーバーライドされたtoStringメソッド内容が出力
	}
}
