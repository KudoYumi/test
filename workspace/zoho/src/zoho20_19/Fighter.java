package zoho20_19;

class Fighter extends Human{
	int realDamage;

	Fighter(String name){
		super(name,"戦士",100,0,1.5);
	}


	public void attack(Monster m) {
		int n = new java.util.Random().nextInt(10);
		//確率1/10で必殺技、9/10で通常攻撃

		if(n==0 || n==1) {
			System.out.println(name+"は剣を振り下ろした");

			realDamage = (int)((new java.util.Random().nextInt(10)+1)*dmg);
			//通常攻撃時に実際に与えるダメージを計算

			System.out.println
			(name+"はモンスターに"+realDamage+"与えた");
			m.hp -= realDamage;
		}else { //残りの場合
			System.out.println("会心の一撃");
			int specialDmg =
					((int)((new java.util.Random().nextInt(10)+1)*dmg))*5;

			System.out.println(name+"はモンスターに"+specialDmg+"与えた");
			m.hp -= specialDmg;
		}


	}


	public void magic(Monster m) {
		System.out.println(name+"は魔法唱えられない");
	}
}
