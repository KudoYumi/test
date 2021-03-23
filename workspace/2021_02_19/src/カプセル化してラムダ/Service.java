package カプセル化してラムダ;

public class Service {
	private Algorithm logic;

	public Service(Algorithm logic) {
		super();
		this.logic = logic;
	}

	public void doProcess(String name,int cnt) {
		System.out.println("start");
		logic.perform(name, cnt);
		System.out.println("end");
	}
}
