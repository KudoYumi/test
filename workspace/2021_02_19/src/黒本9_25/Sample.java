package 黒本9_25;

public class Sample {
	private int num;
	private String name;

	public Sample(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Sample == false) {
			return false;
		}
		if(this.num==((Sample)obj).num
				&& this.name == ((Sample)obj).name) {
			return true;  //numもnameも同じならtrue
		}
		return false;
	}

}
