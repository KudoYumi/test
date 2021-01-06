package exe08;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("tokyo","taro");
	/* 左側の引数に名前入れないといけないのに
	 * 住所入れてる。
	 * でもこのままだとそのまんまコンパイル通る。
	 * このような不正な値が代入されないようにラッパークラスを用いる。
	 */
	}
}
