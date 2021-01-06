package zoho_RPG18;

import java.util.Random;

class Wizard extends Human{

	public Wizard(String name) {
		super(name,"魔術師",50,50,0.5);
	}

	@Override
	void attack(Monster m) {
		System.out.println(name+"は杖をふるった");
			int actualDmg2 = (int)((new Random().nextInt(10)+1)*dmg);
			m.hp -= actualDmg2;
		System.out.println(name+"はモンスターに"+actualDmg2+"ダメージ与えた\n");
	}

	@Override
	void magic(Monster m) {
		if(this.mp>=10) {
			System.out.println(name+"は呪文唱えた");
				int magic_Dmg = (new Random().nextInt(10)+1)*10;
				m.hp -= magic_Dmg;

			System.out.println(name+"はモンスターに"+magic_Dmg+"与えた\n");
				mp -= 10;
		}else {
			System.out.println("魔力が足りない！\n");
		}
	}

}
