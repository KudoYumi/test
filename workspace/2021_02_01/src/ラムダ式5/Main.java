package ラムダ式5;

public class Main {
	public static void main(String[] args) {
		Algorithm al = name -> System.out.println("hello"+name);

		Service s = new Service();
		s.setLogic(al);
		s.doProcess("Lambda");
	}
}
