package 黒本3章10;

public class Sample {
	private int num;

	public Sample(int num) {
		this.num = num;
	}

	public boolean equals(Sample obj) { //オーバーライド
		if(obj==null) {
			return false;
		}
		return this.num == obj.num;
	}
}
