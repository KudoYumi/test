package 憩チャンネルinterface;

public class Sub extends Super{
	public static void main(String[] args) {
		test();

		new Sub().subCall();
	}

	public void subCall() {
		call();
	}
}
