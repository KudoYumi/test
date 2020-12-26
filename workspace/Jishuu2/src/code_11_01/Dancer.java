package code_11_01;

public class Dancer extends Character{
	public void dance() {
		System.out.println(this.name+"は踊った");
	}

	public void attack(Matango m) {
		m.hp -= 5;
		System.out.println(this.name+"は"+ m.suffix +"に5ダメージ与えた");
	}
}


/* モンスターのレベル上がればattackメソッドの攻撃力も変化するはず
 * てことはWerewolf時点では、attackメソッドを抽象メソッドにしといても問題ないのでは？
 */
