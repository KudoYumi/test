package 黒本9_21;

public class Main {
	public static void main(String[] args) {
		Algorithm logic = new Algorithm() {

			@Override
			public void perform(String name) {
				System.out.println("hello"+name);
			}
		};

		Algorithm logic2 = name -> System.out.println("hello"+name);

		Service s = new Service();
		s.setLogic(logic);
		s.doProcess("Lambda");

		s.setLogic(logic2);
		s.doProcess("ラムダ");
	}
}
