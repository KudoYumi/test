package exercise7;

public class Computer {
	private String name;
	private int cores;

	public Computer(String name,int cores) {
		this.name = name;
		this.cores = cores;
	}

	public Computer(String name) {
		this(name,32);
	}

	public Computer() {
		this("M200"); //this("M200",32)
	}
}
