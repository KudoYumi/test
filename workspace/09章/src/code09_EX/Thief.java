package code09_EX;

public class Thief {
	String name;
	int hp;
	int mp;



	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}


	public Thief(String name, int hp) {
		this(name,hp,5);
		/*  this.name = name;
			this.hp = hp;
			this.mp = 5;
			と書いても同じこと。
		 */
	}


	public Thief(String name) {
		this(name,40,5);
		// 17行目があるからthis(name,40)でもよい。
		// 問題文の「重複コードをなくすように」という指定があるから
		// this(name,40)のほうが望ましい。
	}



}