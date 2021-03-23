package 黒本9_21;

public class Service {
	private Algorithm logic;

	public void setLogic(Algorithm logic) {
		this.logic = logic;
	}

	public void doProcess(String name) {
		System.out.println("start");
		logic.perform(name); //まだ実装されてない
		System.out.println("end");
	}
}
