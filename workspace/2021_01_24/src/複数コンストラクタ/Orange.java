package 複数コンストラクタ;
//プログラムの流れを網羅
public class Orange {
	int i;

	Orange(){
		this(10);
		System.out.println("初期化完了");
	}

	Orange(int i){
		this(i,5);
		this.i = i*10;
	}

	Orange(int i,int y){
		this.i = i*y;
		System.out.println("フィールドの値は"+this.i);
	}

	public static void main(String[] args) {
		Orange o = new Orange();
		System.out.println(o.i);
	}
}
