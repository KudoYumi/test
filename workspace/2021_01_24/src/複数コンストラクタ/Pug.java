package 複数コンストラクタ;

public class Pug {
	int i;

	Pug(){
		this(100);
	}

	Pug(int i){
		this(i,5);
		this.i = i*10;
	}

	Pug(int i,int y){
		i = i*y;
	/* ローカル変数いじってるだけだから
	 * フィールドの値には影響なしだから
	 * 無視してもいい。
	 */
	}

	public static void main(String[] args) {
		System.out.println(new Pug().i);
	}
}
