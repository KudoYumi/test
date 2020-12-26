package code12_01;

public abstract class Character implements Life{
	String name;
	int hp;

	public void run() {
		System.out.println(this.name+"は逃げた");
	}

	public abstract void attack(Matango m);

}
