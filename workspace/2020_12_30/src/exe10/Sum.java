package exe10;

class Sum extends Calculation{

	public Sum(double[] dt) {
		super(dt);
	}

	@Override
	public double calculate() {
		double sum=0.0;

		for(int i=0; i<getDt().length; i++) {
			sum += getDt()[i];
		}

	/*	for(double d:getDt()) {
			sum += d;
		} */
		return sum; //double型
	}

	public double average() { //上の合計を使える
		return	calculate()/getDt().length;
	}
}
