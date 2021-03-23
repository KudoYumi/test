package 白本7_20_2;

public class Bird {
	Colibri c;

	void setInstance(Colibri c) {
		this.c = c;
	}

	void twitter() {
		System.out.println(c); //cのtoString()
	}

	@Override
	public String toString() {
		return "Bird [c=" + c + "]";
	}

}
