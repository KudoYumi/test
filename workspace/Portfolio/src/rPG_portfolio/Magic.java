package rPG_portfolio;

public abstract class Magic { //簡単のため攻撃魔法しかないとする
	String name;
	int dmg;
	boolean status; //ステータスは毒、とか沈黙の複数のばあいどうしたら？

	Magic(String name){
		this.name = name;
	}
}
