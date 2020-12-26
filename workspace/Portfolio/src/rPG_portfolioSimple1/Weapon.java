package rPG_portfolioSimple1;

class Weapon extends Item{ //武器はアイテムの一種とした
	int dmg; //武器自体の威力

	Weapon(String name,int num,int dmg){
		super(name,num);
		this.dmg = dmg;
	}
}
