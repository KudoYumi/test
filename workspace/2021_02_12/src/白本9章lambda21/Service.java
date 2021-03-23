package 白本9章lambda21;

class Service {
	private Algorithm logic;

	public void setLogic(Algorithm logic) {
		this.logic = logic;
	}

	public void doProcess(String name) {
		System.out.println("start");
		logic.perform(name);
		System.out.println("end");
	}
}
