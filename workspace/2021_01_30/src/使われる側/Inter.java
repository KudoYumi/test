package 使われる側;

public interface Inter {
	String hello(String name);

	static A createA() {
		return new A();
	}

	static B createB() {
		return new B();
	}

	static C createC() {
		return new C();
	}


}
