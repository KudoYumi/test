package exe07;

public class Sum extends Calculation{

	public Sum(double[] dt) {
		super(dt);
	}

	public double average() {
		double total=0;

		for(double d:getDt()) {
			total+=d;
		}
		return total/getDt().length;
	}

	@Override
	public double calculate() {
		double total=0;

		for(double d:getDt()) {
			total+=d;
		}

		return total;
	}
}
