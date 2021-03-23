package 白本10_55;

public class Main {
	public static void main(String[] args) {
		Message m,mA,mB;

		m = new Message();
		mA = new MessageA();
		mB = new MessageB();

		System.out.println(m.disp());//message
		System.out.println(mA.disp());//message
		System.out.println(mB.disp());//BBB
	}
}
