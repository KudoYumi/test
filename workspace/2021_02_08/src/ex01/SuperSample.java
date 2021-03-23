package ex01;

public class SuperSample {

	protected void hoge() {
		System.out.println("Super");
	}

	public void access() {
		this.hoge();
	}
}
