package 白本7_20;

public class Bird {
	Colibri c;

	void setInstance(Colibri c) {
		this.c = c;
	}

	void twitter() {
		System.out.println(c); //cのtoString()
	}
}
