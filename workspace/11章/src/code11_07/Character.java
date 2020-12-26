package code11_07;

public abstract class Character { //メソッドにabstractあったらclassもabstract
	String name;
	int hp;

	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}


	//戦う
	public abstract void attack(Matango m);
		// public abstract 戻り値 メソッド名(引数リスト)




	//死んだ
	public void die() {
		if(this.hp<=0) {
			System.out.println(this.name + "は死亡した");
		}

	}
}
