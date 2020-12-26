package code14_07;

public class Hero {
	String name;
	int hp;
// equals()メソッドのオーバーライドを定義

	public boolean equals(Object o) {
		if(this == o) {return true;}  //もし等値なら等価

		if(o instanceof Hero) {
			Hero h = (Hero)o; //ダウンキャスト可能か判定
			if(this.name.equals(h.name) && this.hp==h.hp) {
				return true;  //ダウンキャストできた上で、名前とhp一緒なら等価
			}
		}
		return false; //そうでないなら等価でない。

	}


	/*もしも等価と等値を一緒としたい場合は、
	 *等値⇒等価、等価⇒等値　という定義の記述をすればよい。
	 */


}
