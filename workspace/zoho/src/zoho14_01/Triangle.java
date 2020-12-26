package zoho14_01;

public class Triangle {
//(1)
	private double a,b,c;

	public double getAlength() {
		return this.a;
	}
	public void setAlengh(double a) {
		this.a = a;
	}

	public double getBlength() {
		return this.b;
	}
	public void setBlengh(double b) {
		this.b = b;
	}

	public double getClength() {
		return this.c;
	}
	public void setClengh(double c) {
		this.c = c;
	}  //(1)終わり


//(2)
	public Triangle(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

//(3)
	public Triangle(double a,double b) {
		this.a = a;
		this.b = b;
		this.c = 5;
	}

	public Triangle(double a) {
		this.a = a;
		this.b = this.c = a = 3.0;
	}

//(4)
	public void incircleRadius(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;

		double s = (a+b+c)/2;
		double r;
	}

//(5)



}
