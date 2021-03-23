package 複数コンストラクタ;

public class Dog {
	int i;

	Dog(){
		this(100);
	}

	Dog(int i){
		this(i,5);
		this.i = i*10;
	}

	Dog(int x,int y){
		this.i = x*y;
	//	System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println(new Dog().i);
	}
}
