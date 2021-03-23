package 白本6_22;

public class Dog {
	int i;

	Dog(){
		this(100);
	}

	Dog(int i){
		this(i,5); //this(100,5)
		this.i = i*10; //フィールドiが1000
		System.out.println(i);//100
	}

	Dog(int i,int y){
		this.i = i*y; //フィールドiが500
		System.out.println(i); //100
	}

	public static void main(String[] args) {
		System.out.println("フィールドiの値は"+new Dog().i);
	}
}
