package rPG_portfolio;

class Player extends Character{ //操作キャラ
	Weapon buki;

	Player(String name,int hp,int MaxHp,int mp,int MaxMp,Weapon w){
		super(name,hp,MaxHp,mp,MaxMp);
		this.buki = w;
	}

	void use(Item i) {

	}

	void attack(Monster m) { //buki使ってmを攻撃
		if(this.buki!=null) {

		}
	}

	void MagicAttack() {}
}
