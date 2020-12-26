package zoho13_02;

public class Mitsumori {
	String name;
	int tanka;
	int number;
	double ritsu;
	int total;

	public void disp(String name,int tanka,int number,double ritsu) {
		this.name = name;
		this.tanka = tanka;
		this.number = number;
		this.ritsu = ritsu;

		System.out.print
		(this.name+"\t"+this.tanka+"\t"+this.number+"\t"+this.ritsu+"\t");
	}

	public void dispTotal() {
		this.total = (int)(this.tanka * this.number * (1-this.ritsu));
		System.out.println("合計金額"+total);
	}
}
