package code12_09;

public abstract class Character{
	String name;
	int hp;

	public void run() {
		System.out.println(this.name+"は逃げた");
	}

	public abstract void attack(Monster m);

}
