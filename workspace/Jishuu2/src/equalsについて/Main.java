package equalsについて;

public class Main {

	public static void main(String[] args) {
		Character c1 = new Character("くどう","SE",1000,50);
		Character c2 = new Character("くどう","SES",100,100);

		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
	}

}
