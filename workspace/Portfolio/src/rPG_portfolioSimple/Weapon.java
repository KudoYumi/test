package rPG_portfolioSimple;

class Weapon extends Item{
	int weapon_dmg;
	boolean reach; //対空機能あるかどうか


	Weapon(String name,int dmg,boolean reach){
		super(name);
		this.weapon_dmg = dmg;
		this.reach = reach;
	}


}
