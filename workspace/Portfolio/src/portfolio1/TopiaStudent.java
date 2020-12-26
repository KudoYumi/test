package portfolio1;

public abstract class TopiaStudent implements Human{
	int hp;
	String name;

	//コンストラクタ
	public TopiaStudent(int hp,String nm) {
		this.hp = hp;
		this.name = nm;
	}

	public abstract void talk(Hero h);

	public abstract void attack(Hero h);

	public void die() {
		System.out.println(this.name+"は戦闘不能です。");
		this.hp = 0;
	}

	public void run() {
		System.out.println("戦闘から逃げた");
	}
}
