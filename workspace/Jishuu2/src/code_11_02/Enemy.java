package code_11_02;

public class Enemy implements Creature{
	int hp;
	String name;

	public void run() {
		System.out.println(this.name+"は逃げた");
	}
}

/* implementsクラスは　抽象メソッドあってもいいの？　エラー出てないけど...
 ⇒文法上間違えではないけど、まずそのクラスの変数はnewできない。
   interfaceを継承した、abstract抽象クラスも一応implementsだけど、
   紛らわしいので、P.449の表11-1を常識にすべき。
*/