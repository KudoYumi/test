package rPG_portfolioSimple;

class Player extends Character{ //操作キャラ
	final int MaxHp;
	final int MaxMp;
	int Dmg;
	Item item; //Itemインスタンスは武器もアイテムもふくんでる


	Player(String name,int hp,int MaxHp,int mp,int MaxMp,int Dmg,Item item){
		super(name,hp,mp);
		this.MaxHp = MaxHp;
		this.MaxMp = MaxMp;
		this.Dmg = Dmg;
		this.item = item;
	}



//モンスターが1体の時もあれば複数の時もあるからArrayList使った方がいいんでは
	void attack(Monster[] monsters) {}


	void MagicAttack() {}
}
