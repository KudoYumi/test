package exe01;

public class Poly {

	public static void main(String[] args) {
		Foo foo = new Foo();
		Bar bar = new Bar();

		display(foo);
		display(bar);
	}

	public static void display(Version ver) {
		System.out.println(ver.getVersion());
	}

}
