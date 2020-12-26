package portfolio2;

public class Hero extends Topia{

	 private int maxHp;
	 private int damage;
	 private int powerSkill;
	 private int realDamage = this.damage * this.powerSkill;


	 //コンストラクタ
	 public Hero(String nm,int hp,int maxHp,int damage,int pS) {
		 super(nm,hp);
		 this.maxHp = maxHp;
		 this.damage = damage;
		 this.powerSkill = pS;
	 }


	 public void attack(Hero x) {

		 if(x.hp>this.realDamage) {
	//		 realDamage = this.damage * this.powerSkill;

			 System.out.println(this.name+"は"+x.name+"に"+this.realDamage+"与えた");
			 x.hp -= this.realDamage;
			 System.out.println(x.name+"のHPが"+x.hp+"になった");

		 }else if(x.hp>0){
			 System.out.println(this.name+"は"+x.name+"に"+this.realDamage+"与えた");
			 x.die();
			 System.out.println(this.name+"が勝った");
		 }
	 }

	 public int getMaxHp() {return this.maxHp;}

	 public int getPS() {return this.powerSkill;}

	 public int getRD() {return this.realDamage;}
}
