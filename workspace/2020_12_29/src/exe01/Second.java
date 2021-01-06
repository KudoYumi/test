package exe01;

class Second extends First{
	public Second create() {
		return new Second();
	}

	protected First create(int n) {
		return new First();
	}
}
