package 白本4_10;

public class Orange {
	int i;

	Orange(){
		this(10);
	}

	Orange(int i){
		this(i,10);
		this.i *= 10;
	}

	Orange(int i,int y){
		this.i = i*y;
	}

	public static void main(String[] args) {
		System.out.println(new Orange().i);
	}
}
