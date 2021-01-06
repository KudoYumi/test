package zoho_RPG18;

import java.util.Random;
class Fighter extends Human{

	public Fighter(String name) {
		super(name,"戦士",100,0,1.5);
	}

	@Override
	void attack(Monster m) {
		System.out.println(name+"は剣を振り下ろした");
			int actualDmg1 = (int)((new Random().nextInt(10)+1)*dmg);
			m.hp -= actualDmg1;
		System.out.println(name+"はモンスターに"+actualDmg1+"ダメージ与えた\n");
	}

	@Override
	void magic(Monster m) {
		System.out.println(name+"は呪文唱えられない\n");
	}


}
