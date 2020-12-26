package code_11_01;

public class Hero extends Character{
	// characterを継承


	public void attack(Matango m) {
		System.out.println(this.name+"は"+ m.suffix +"を攻撃した");
		System.out.println(m.suffix + "に10ダメージ与えた");

		m.hp -= 10;
	}
}
