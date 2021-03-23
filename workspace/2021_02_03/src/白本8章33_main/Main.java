package 白本8章33_main;

import 白本8章33.Car;

public class Main {
	public static void main(String[] args) {
		Car taxi = Car.create(); //右辺はTaxiインスタンスへの参照をCarとして見てる。

		taxi.drive(); //ダイナミックバインディングでTaxiのdriveが呼ばれる。
		//でも非検査例外処理してないから、JVMでそれが表示される。
	}
}
