package portfolio2;

public abstract class Topia {
	String name;
	int hp;
	
	//コンストラクタ
	public Topia(String nm,int hp) {
		this.name = nm;
		this.hp = hp;
	}
	
	//抽象メソッド
	public abstract void attack(Hero h);
	
	
	
	public void die() {
		System.out.println(this.name+"は戦闘不能です。");
	}
}
