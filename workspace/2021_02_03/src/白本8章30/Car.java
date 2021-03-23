package 白本8章30;

class Car {
	void drive() throws Exception{
		throw new Exception();
	}
}

class Taxi extends Car{
	public static void main(String[] args) {
		try {
			new Taxi().drive(); //直接Taxiのメソッドを使ってる

		}catch(RuntimeException re) {
			System.out.println("直接使って非検査例外処理");
		}
	// だけどこれはポリモを使っておらず美しくないコードだと思う。
	// 正しくはポリモ使ってオーバーライドしたTaxiのdriveを呼ぶ！
	}

	@Override
	void drive() throws RuntimeException{ //サブインスタンスだからオッケー
		throw new RuntimeException();
	}
}
