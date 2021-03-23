package staticメソッド;

class Sub extends Super{
	public static void hoge() {  //protectedより狭い公開範囲にするとエラー
		System.out.println("Sub");
	}
}
