package override01;

public class B extends A{

	public void bye() {
		System.out.println("bye");
	}

	@Override
	public void hello() {
		System.out.println("hi");
	}
}
