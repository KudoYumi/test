package 紫本6_22;

public class Cow extends Animal{
	@Override
	public String toString() {
		return "Cow []";
	}
	@Override
	Cow getAnimal() {
		return new Cow();
	}
}
