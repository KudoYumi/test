package rPG_portfolioSimple;

public class Monster { //簡単のため、名前とHPとMP持つことくらいにする。
	String name;
	int hp;
	int MaxHp;
	int mp;
	int MaxMp;
	int dmg;

	Monster(String name,int hp,int MaxHp,int mp,int MaxMp,int dmg){
		this.name = name;
		this.hp = hp;
		this.MaxHp = MaxHp;
		this.mp = mp;
		this.MaxMp = MaxMp;
		this.dmg = dmg;
	}

	void attack(Player[] players) {
		//全体とかに攻撃の場合ってどのような処理？いちいち一人ずつって処理は美しくない
		//引数に配列を用いれば、一部に攻撃か全体か選べる
		System.out.println(name+"の攻撃");

	
	}

}
