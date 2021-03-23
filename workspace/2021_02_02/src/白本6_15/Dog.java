package 白本6_15;

public class Dog {
	int i;

	Dog(){
		this(10);
	}

	Dog(int i){
		this(i,5);
		this.i *= 10;
	}

	Dog(int i,int y){
		this.i = i*y;
	}

	public static void main(String[] args) {
		System.out.println(new Dog().i
				);
	}
}
