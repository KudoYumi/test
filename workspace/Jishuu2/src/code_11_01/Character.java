package code_11_01;

public abstract class Character {
	// そもそも実装メソッドしかない抽象クラスってある？⇒ある！　P.474参考
	// 抽象メソッドが１個でもあったら抽象クラスなのはわかるが

	String name;
	int hp;

	// 逃げるメソッド
	public void run() {
		System.out.println(this.name+"は逃げ出した");
	}

	// 戦うメソッド
	public abstract void attack(Matango m);

}
