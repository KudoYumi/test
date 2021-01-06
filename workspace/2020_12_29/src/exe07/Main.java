package exe07;

public class Main {

	public static void main(String[] args) {

		double[] d = {0.5, 1.5, 2.5};
		Sum s = new Sum(d);

		System.out.println(s.average());

		System.out.println(s.calculate());
	}

}
