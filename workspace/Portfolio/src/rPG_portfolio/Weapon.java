package rPG_portfolio;

class Weapon {
	String name;
	int weapon_dmg;
	boolean reach; //対空機能あるかどうか


	Weapon(String name,int dmg,boolean reach){
		this.name = name;
		this.weapon_dmg = dmg;
		this.reach = reach;
	}


}
