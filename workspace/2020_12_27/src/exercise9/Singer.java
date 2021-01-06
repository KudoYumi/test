package exercise9;

public class Singer {
	private final String name;

	public Singer(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

/*	public void setName(String name) {
		this.name = name;
	}*/
	/* フィールドにfinalがついてるので書き換えられない。
	 * setterも削除してやると、変更不可でかつ不可視にできた。
	 * ここでサブクラスを作ってみる。
	 */
}
