package exe10;

public class Main {

	public static void main(String[] args) {
		double[] dou = {0.5,1.5,2.5,3.5};

		Sum sum = new Sum(dou);
		Calculation calc = sum;

		System.out.println(calc.calculate());
		System.out.println(sum.average());
	}

}
