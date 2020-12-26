package zoho20_18;

class Wizard extends Human{
	int magic_dmg;

	//コンストラクタ
	Wizard(String name){
		super(name,"魔導士",50,50,0.5);
	}

	//オーバーライド
	void attack(Monster m) {
		System.out.println(name+"は杖をふるった");

		super.attack(m);
		System.out.println
			(name+"はモンスターに"+super.actualDmg+"与えた");

	}

	//実装メソッド
	void Magic(Monster m) {
		magic_dmg = (new java.util.Random().nextInt(10)+1)*10;

		System.out.println(name+"は呪文を唱えた");

		m.hp -= magic_dmg;
		System.out.println(name+"はモンスターに"+magic_dmg+"与えた");

	}
}
