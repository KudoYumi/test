package 黒本3章;
//3章の8

public class Sample {
	private int num;

	public Sample(int num) {
		this.num = num;
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
		if(obj!=null) { //nullでない
			if(obj instanceof Sample) { //型が同じまたはサブクラス
				if(((Sample)obj).num==this.num) { //上記の条件のもとnumフィールドが同じ
					return true;
				}
			}
		}
		return false;
	}


}
