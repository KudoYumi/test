package code11_09;

public class Dancer extends Character {
	/*継承先のCharacterクラスがすでに抽象クラスだから、
	 *Dancerクラスもabstractつけるか、
	 *または抽象メソッドのatacckメソッドをオーバーライドしないといけない。
	 */

	public void dance() {
		System.out.println(this.name + "は踊った");
	}

	public void attack(Matango m) {}

}
