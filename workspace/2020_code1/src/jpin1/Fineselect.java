package jpin1;

public class Fineselect {
	String name;
	int age;
	String job;

	Fineselect(String name,int age,String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}


	public void show() {
		System.out.println("名前は"+name+"年齢は"+age+"仕事は"+job+"です");
	}
}
