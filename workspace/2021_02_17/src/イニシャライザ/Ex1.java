package イニシャライザ;

//イニシャライザで初期化後にコンストラクタで初期化したら、、、
public class Ex1 {
	static final int[] array;
	final int[] arry;

	static {
		array = new int[3];
	}

	static{
	//	array = new int[4];
	}

	{
		arry = new int[2];
	}

	public Ex1() {
	//	arry = new int[3];
	}

	//つまり一度初期化したら変更不可
}
