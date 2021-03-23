package 白本継承02;

public class Main implements Inter{
	public String toString() {
		return "I am Main";
	}

	public static void main(String[] args) {
		Sub sub = new Sub();
		Main main = sub;
		Inter inter = main;
		System.out.println(inter);
	}
}
