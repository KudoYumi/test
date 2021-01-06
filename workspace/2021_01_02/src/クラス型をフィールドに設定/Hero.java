package クラス型をフィールドに設定;

class Hero {
	String name;
	int hp;
	Sword sword;

	public Hero(String name,int hp,Sword sword) {
		this.name = name;
		this.hp = hp;
		this.sword = sword;
	}

	public void attack() {
		System.out.println(name +"は攻撃した");
		System.out.println("敵に"+sword.damage+"与えた");
	}
}
