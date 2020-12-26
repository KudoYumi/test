package zoho20_18;

class Fighter extends Human{

	//コンストラクタ
	Fighter(String name){
		super(name,"戦士",100,0,1.5);
	}

	//オーバーライド
	void attack(Monster m) {
		System.out.println(name+"は剣を振り下ろした");

		super.attack(m);
		System.out.println
			(name+"はモンスターに"+super.actualDmg+"与えた");
	}

	//実装
	void Magic(Monster m) {
		System.out.println(name+"は呪文は唱えられない");
	}
}
