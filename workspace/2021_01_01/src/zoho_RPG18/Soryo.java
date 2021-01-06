package zoho_RPG18;

import java.util.Random;

class Soryo extends Human{
	public Soryo(String name) {
		super(name,"僧侶",50,50,0.5);
	}

	@Override
	void attack(Monster m) {
		System.out.println(name+"は杖をふるった");
			int actualDmg3 = (int)((new Random().nextInt(10)+1)*dmg);
			m.hp -= actualDmg3;
		System.out.println(name+"はモンスターに"+actualDmg3+"ダメージ与えた\n");
	}

	@Override
	void magic(Monster m) {
		if(this.mp>=10) {
			System.out.println(name+"は呪文唱えた");
			int magic_Dmg = (new Random().nextInt(10)+1)*5;
			m.hp -= magic_Dmg;

			System.out.println(name+"はモンスターに"+magic_Dmg+"与えた\n");
			mp -= 10;
		}else {
			System.out.println("魔力が足りない！\n");
		}
	}

}
