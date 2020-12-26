package code10_10;
//　継承　extendsをつかう

public class SuperHero extends Hero{
//	String name ="Minatoo"; フィールドはオーバーライドさせない。

	boolean flying; //追加した

	public SuperHero() {
		super();
	}

	//飛ぶ
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}

	public void run() {
		System.out.println(this.name + "は撤退した");
	}


	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	}


}
