package 紫本6_22;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = {new Animal(),new Cow()};
		for(Animal a:animals) {
			Animal x = a.getAnimal();
			System.out.println(x);
		}
	}
}
