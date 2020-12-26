package rPG_portfolio;

class Character {
	String name;
	int hp;
	final int MaxHp;
	int mp;
	final int MaxMp;


	Character(String name,int hp,int MaxHp,int mp,int MaxMp){
		this.name = name;
		this.hp = hp;
		this.MaxHp = MaxHp;
		this.mp = mp;
		this.MaxMp = MaxMp;
	}

}
