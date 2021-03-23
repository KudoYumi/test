package 継承関係2;

public class Main {
	public static void main(String[] args) {

		Abs a = new Ex();

		System.out.println(a.num);
		a.run();

		Ex ex = (Ex)a; //ダウンキャストしたけどaの中身はExのインスタンスへの参照
		System.out.println(ex.num);
		ex.run();
	}
}
