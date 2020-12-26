package code9_EX1;

public class Thief {
	String name;
	int hp;
	int mp;

	//デフォルトコンストラクタはないと問題で指定されてる。

	public Thief(String nm1,int hp1,int mp1) {  //１個目のコンストラクタ
		this.name = nm1;
		this.hp = hp1;
		this.mp = mp1;
	}


	public Thief(String nm2,int hp2) { //２個目のコンストラクタ
		this(nm2,hp2,5); //１個目のを呼び出し、mp1に5を代入してる。
	}
	/*
	public Thief(String nm,int hp) {
		this.name = nm;
		this.hp = hp;
		this.mp = 5;
	} でもよい。*/


	public Thief(String nm3) {
		this(nm3,40);
	  /*２個目のコンストラクタ呼び出し、hp2に40代入
		すると18行目のコードにより、this(nm3,40,5)となり、
		１個目のコンストラクタ起動。
		最初からthis(nm3,40,5) でもよい。*/
	}
}
