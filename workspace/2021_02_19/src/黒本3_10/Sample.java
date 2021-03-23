package 黒本3_10;

public class Sample {
	private int num;

	public Sample(int num) {
		super();
		this.num = num;
	}

	public boolean equals(Sample obj) {
		System.out.println("オーバーロードした方");
		if(obj==null) { return false;}
		return this.num == obj.num;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("オーバーライド");
		if(obj!=null && obj instanceof Sample) {
			if(((Sample)obj).num == this.num) {
				return true;
			}
		}
		return false;
	}
}
