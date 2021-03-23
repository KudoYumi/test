package 白本8章33_main;

import 白本8章33.Car;

public class Main2 {
	public static void main(String[] args) {
		Car taxi = Car.create(); //右辺はTaxiインスタンスへの参照をCarとして見てる。

		try {
			taxi.drive(); //非検査発生

		}catch(RuntimeException re) {
			System.out.println("非検査例外を処理");

		}

	}
}
